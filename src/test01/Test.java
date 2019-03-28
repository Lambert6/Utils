package test01;

import java.util.Random;

public class Test {
	
		public static long getRandomString(int length){
		     String str="0123456789";
		     Random random=new Random();
		     StringBuffer sb=new StringBuffer();
		     for(int i=0;i<length;i++){
		       int number=random.nextInt(10);
		       sb.append(str.charAt(number));
		     }		     
		     return Long.valueOf(sb.toString());		
	}
		public static String getRandomEmail(int length){
		     String str="0123456789";
		     String p = "@11.com";
		     Random random=new Random();
		     StringBuffer sb=new StringBuffer();
		     for(int i=0;i<length;i++){
		       int number=random.nextInt(10);
		       sb.append(str.charAt(number));
		     }	
		     String Email = sb.toString()+p;
		     return Email;		
	}
		public static void main(String[] args) {
			System.out.println(getRandomString(10));
			System.out.println(getRandomEmail(8));
		}
		
}
