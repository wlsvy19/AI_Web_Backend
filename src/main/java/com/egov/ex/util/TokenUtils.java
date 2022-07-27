package com.egov.ex.util;


import com.egov.ex.entity.UserInfo;
import io.jsonwebtoken.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class TokenUtils {

    private final CryptoUtil cryptoUtil;
    private final String SECRET_KEY = "AilsEx123223222SecretKey";
    private final String REFRESH_KEY = "ExAils23423333324RefreshKey";
    private final String DATA_KEY = "data";
    private final int ACCESS_TOKEN_TIME = 1000 * 60 * 60 * 24; // 24시간세션
    private final int ACCESS_TOKEN_TIME_REBUILD = 1000 * 60 * 60 * 12; // 1) 12시간보다 작게 남을대 request로갱신  <=사용중
    private final int REFRESH_TOKEN_TIME = 1000 * 60 * 60 * 24 * 7; // 2) refresh토큰으로 갱신

    // private final int ACCESS_TOKEN_TIME1 = 1000 * 60 * 5;
    // private final int REFRESH_TOKEN_TIME1 = 1000 * 60 * 10;

    public String generateJwtToken(UserInfo usersEntity) {
        return Jwts.builder()
                .setSubject(usersEntity.getUserNo() + "")
                .setHeader(createHeader())
                .setClaims(createClaims(usersEntity))
                .setExpiration(createExpireDate(ACCESS_TOKEN_TIME))
                .signWith(SignatureAlgorithm.HS256, createSigningKey(SECRET_KEY))
                .compact();
    }

    public String saveRefreshToken(UserInfo usersEntity) {
        return Jwts.builder()
                .setSubject(usersEntity.getUserNo() + "")
                .setHeader(createHeader())
                .setClaims(createClaims(new UserInfo()))
                .setExpiration(createExpireDate(REFRESH_TOKEN_TIME))
                .signWith(SignatureAlgorithm.HS256, createSigningKey(REFRESH_KEY))
                .compact();
    }

    public int getAccessTokenUserNo(String token) {
        try{
            Claims accessClaims = getClaimsFormToken(token);
            return  cryptoUtil.decryptUserNo(accessClaims.get(DATA_KEY)+"");
        }catch (Exception e){

        }
        return 0;
    }


    public boolean isValidToken(String token) {
        System.out.println("isValidToken is : " + token);
        try {
            Claims accessClaims = getClaimsFormToken(token);
            this.rebuildToken(accessClaims);
            System.out.println("Access expireTime: " + accessClaims.getExpiration());
            System.out.println("Access userId: " + cryptoUtil.decryptUserNo(accessClaims.get(DATA_KEY)+""));
            return true;
        } catch (ExpiredJwtException exception) {
            System.out.println("Token Expired UserID : " + exception.getClaims().getSubject());
            return false;
        } catch (JwtException exception) {
            System.out.println("Token Tampered");
            return false;
        } catch (NullPointerException exception) {
            System.out.println("Token is null");
            return false;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public boolean isValidRefreshToken(String token) {
        try {
            Claims accessClaims = getClaimsToken(token);
            System.out.println("Access expireTime: " + accessClaims.getExpiration());
            // System.out.println("Access userId: " + accessClaims.get("userId"));
            return true;
        } catch (ExpiredJwtException exception) {
            System.out.println("Token Expired UserID : " + exception.getClaims().getSubject());
            return false;
        } catch (JwtException exception) {
            System.out.println("Token Tampered");
            return false;
        } catch (NullPointerException exception) {
            System.out.println("Token is null");
            return false;
        }
    }


    private Date createExpireDate(long expireDate) {
        long curTime = System.currentTimeMillis();
        return new Date(curTime + expireDate);
    }

    private Map<String, Object> createHeader() {
        Map<String, Object> header = new HashMap<>();
        header.put("typ", "ACCESS_TOKEN");
        header.put("alg", "HS256");
        header.put("regDate", System.currentTimeMillis());

        return header;
    }

    private Map<String, Object> createClaims(UserInfo usersEntity) {
        Map<String, Object> claims = new HashMap<>();
        try {
            claims.put(DATA_KEY, cryptoUtil.encryptUserNo(usersEntity.getUserNo()));
        } catch (Exception e) {
            claims.put(DATA_KEY, "");
        }
        return claims;
    }

    private Key createSigningKey(String key) {
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(key);
        return new SecretKeySpec(apiKeySecretBytes, SignatureAlgorithm.HS256.getJcaName());
    }

    private Claims getClaimsFormToken(String token) {
        return Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET_KEY))
                .parseClaimsJws(token)
                .getBody();
    }

    private Claims getClaimsToken(String token) {
        return Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(REFRESH_KEY))
                .parseClaimsJws(token)
                .getBody();
    }


    private void rebuildToken(Claims accessClaims){
        try {
            Date expDate = accessClaims.getExpiration();
            Date nowDate = new Date();
            long term = expDate.getTime() - nowDate.getTime();
            if (term < ACCESS_TOKEN_TIME_REBUILD) {
                int userNo = cryptoUtil.decryptUserNo(accessClaims.get(DATA_KEY) + "");
                UserInfo user = new UserInfo();
                user.setUserNo(userNo);
                String newAccessToken = this.generateJwtToken(user);
                HttpServletResponse response = ContextUtils.getResponse();
                CookieUtils.addCookie(response, AppConfig.ACCESS_TOKEN, newAccessToken, -1);
            }
        }catch (Exception e){

        }
    }
}
