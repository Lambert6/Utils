package study;

public class test1 {
	public static int staticVar = 0;
	 public int instanceVar = 0;
	public void  test1(){
	 staticVar++;
	 instanceVar++;
	 //System.out.println(staticVar+"----"+instanceVar);
	 }
	public static void main(String[] args) {
		short s1 = 1; 
		//s1 = (short) (s1 + 1);
		 s1 += 1;
		 
		 //
		 String a="foo";
		 String b="foo";
		 
		 //
		 test1  t = new test1();
		 t.test1();

		 //
//		 if(username.equals(¡°zxx¡±){
//			 
//		 }
//		 
		 int[] as = {1,2,3,4,5};
		int bs = as.length;
		//System.out.println(a == b);
	}
}
