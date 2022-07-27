package com.egov.ex.util;

import org.apache.commons.codec.binary.Base64;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileUtil {


    /**
     * 폴더 및 하위폴더 모두 삭제
     * @param path
     */
    public static void deleteFile(String path) {
        File deleteFolder = new File(path);

        if(deleteFolder.exists()){
            File[] deleteFolderList = deleteFolder.listFiles();

            for (int i = 0; i < deleteFolderList.length; i++) {
                if(deleteFolderList[i].isFile()) {
                    deleteFolderList[i].delete();
                }else {
                    deleteFile(deleteFolderList[i].getPath());
                }
                deleteFolderList[i].delete();
            }
            deleteFolder.delete();
        }
    }

    public static String imageToBase64(String filePath) {
        String strBase64 = "";
        File f = new File(filePath);
        if (f.exists() && f.isFile() && f.length() > 0) {
            byte[] bt = new byte[(int) f.length()];
            FileInputStream fis = null;

            try {
                fis = new FileInputStream(f);
                fis.read(bt);
                strBase64 = new String(Base64.encodeBase64(bt));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException e) {
                } catch (Exception e) {
                }
            }
        }
        return strBase64;
    }
}
