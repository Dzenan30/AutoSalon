
package dao;

import java.security.MessageDigest;

public class HashUtil {
    
        public static String getHashPass(String password) {

        String hashpass = "";
        try {
            String plainText = password;
            MessageDigest mdAlgorithm = MessageDigest.getInstance("MD5");
            mdAlgorithm.update(plainText.getBytes());
            byte[] digest = mdAlgorithm.digest();
            StringBuilder hexString = new StringBuilder();

            for (int i = 0; i < digest.length; i++) {
                plainText = Integer.toHexString(0xFF & digest[i]);

                if (plainText.length() < 2) {
                    plainText = "0" + plainText;
                }

                hexString.append(plainText);
            }
            hashpass = hexString.toString();

            return hashpass;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}