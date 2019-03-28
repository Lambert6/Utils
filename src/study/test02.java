package study;

public class test02 {
	
	 static int get (int x) {
		 try {
				x++;
				return x;
				
			}finally {
				return ++x;
			}
	}
	public static void main(String[] args) {
		System.out.println(get(1));
	}
}
