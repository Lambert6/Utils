package test01;

public class printMul {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 9 ; i++) {
			
			for(int j = 1 ; j <= i ; j++) {
				System.out.println(j+"*"+i+" = "+(i*j)+"\t");
			}
			
			System.out.println();
		}
	}
}
