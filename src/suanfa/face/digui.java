package suanfa.face;

public class digui {
	public static void doubleNum(int n) 
	 { 
	  System.out.println(n); 
	  if(n<=5000) {
	   doubleNum(n*2);} 
	  System.out.println(n);   
	 } 
	public static void main(String[] args) {
		doubleNum(10);
	}
}
