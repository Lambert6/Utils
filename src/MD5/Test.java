package MD5;

public class Test {
	public static void main(String[] args) {
		String pwd = HashKit.md5("12345");
		System.out.println(pwd);
	}
}
