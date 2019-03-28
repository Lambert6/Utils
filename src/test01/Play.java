package test01;

public class Play {
	public static int getMul(int end,int sum) {
		int j = sum+1;
		for(int i = 1 ; i <= end-1 ; i++) {
			sum = sum*j;
			j++;
		}
		return sum;		
	}
	public static void main(String[] args) {
		System.out.println(Play.getMul(7,1));
	}
}
