package com.mschultheiss.charmeapp;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Crypto {
	


		public static String makeSha256(String text)
		{
			MessageDigest md;
			try {
				md = MessageDigest.getInstance("SHA-256");
				md.update(text.getBytes("UTF-8"));
				byte[] digest = md.digest();
				 
				return bytesToHex(digest);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("CHARME CRYPTO ERROR AT SHA256");
			}
			return "";
			
		
		}
		 public static String bytesToHex(byte[] bytes) {
		        StringBuffer result = new StringBuffer();
		        for (byte byt : bytes) result.append(Integer.toString((byt & 0xff) + 0x100, 16).substring(1));
		        return result.toString();
		    }
	
}