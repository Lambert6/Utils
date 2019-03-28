package study;

public class test03 {
	public static int method (int n ) {
		if(n == 1) {
			return 1;
		}else {
			return n * method(n - 1);
		}
	}
	public static int f (int n ) {
		if(n == 2 || n == 1) {
			return 1;
		}else {
			return f(n-1)+f(n -2);
		}
	}
	/**
	 * 不用递归的方法求斐波那契
	 * @param n
	 * @return
	 */
	public static long t (long n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		long f1 = 1;
		long f2 = 1;
		long sum = 0;
		for(int i = 2 ; i < n ; i++) {
			sum = f2 + f1;
			f2 = f2 + f1;
			f1 = f2 - f1;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(f(50));
		//System.out.println(t(40));	
	}
}
