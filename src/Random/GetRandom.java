package Random;

import java.util.Random;

public class GetRandom {
 	 //随机生成一个long数值
 	public static long getRandomString(int length){
	     String str="123456789";
	     Random random=new Random();
	     StringBuffer sb=new StringBuffer();
	     for(int i=0;i<length;i++){
	       int number=random.nextInt(9);
	       sb.append(str.charAt(number));
	     }		     
	     return Long.valueOf(sb.toString());		
}
 	public static void main(String[] args) {
 		String r  = "";
		for(int i = 1 ; i <= 5 ; i++) {
			String a = "";
			long l = GetRandom.getRandomString(3);
			a = ", "+String.valueOf(l);
			r= r + a;
		}
		System.out.println(r);
	}
 	//生成一个随机邮箱
 	public static String getRandomEmail(int length){
	     String str="123456789";
	     String p = "@user.com";
	     Random random=new Random();
	     StringBuffer sb=new StringBuffer();
	     for(int i=0;i<length;i++){
	       int number=random.nextInt(9);//下标要和数值long数值数值啊啊
	       sb.append(str.charAt(number));
	     }	
	     String Email = sb.toString()+p;
	     return Email;		
}
}
