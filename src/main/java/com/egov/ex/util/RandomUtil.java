package com.egov.ex.util;

import java.util.Random;

public class RandomUtil {
    public static String makeTempPassword(){
        return makeText();
    }

    public static String makeMobileCertification(){
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();

        String chars[] = ("0,1,2,3,4,5,6,7,8,9").split(",");

        int chars_size = chars.length;
        for(int i = 0; 6 > i; i++){
            buffer.append(chars[random.nextInt(chars_size)]);
        }

        return buffer.toString();
    }

    public static String makeText(){
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();

        String chars[] = ("A,B,C,D,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,U,V,W,X,Y,Z," +
                "a,b,c,d,e,f,g,h,i,j,k,m,n,p,q,r,s,t,u,v,w,x,y,z," +
                "0,1,2,3,4,5,6,7,8,9").split(",");

        int chars_size = chars.length;
        for(int i = 0; 6 > i; i++){
            buffer.append(chars[random.nextInt(chars_size)]);
        }

        return buffer.toString();
    }
}
