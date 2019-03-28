package study;

public class GetLower {
	public static void main(String[] args) {
		String str = "asdfghjklFSFWHEORUHFWNLKAMD^&%$^&%#$#",upper = "QWERTYUIOPASDFGHJKLMNBVCXZ",lower = "qwertyuiopasdfghjklmnbvcxz";
		int lc = 0,uc = 0,oc = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			String tem = String.valueOf(str.charAt(i));
			if(upper.contains(tem)) {
				uc++;
			}else if(lower.contains(tem)) {
				lc++;
			}else {
				oc++;
			}
		}
		System.out.println("第一种："+lc+" "+uc+" "+oc);
		
		int lc2 = 0,uc2 = 0,oc2 = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			char tem2 = str.charAt(i);
			if(tem2 >= 'a' && tem2 <= 'z') {
				lc2++;
			}else if(tem2 >= 'A' && tem2 <= 'Z'){
				uc2++;
			}else {
				oc2++;
			}
		}
		System.out.println("第二种："+lc2+" "+uc2+" "+oc2);
	}
}
