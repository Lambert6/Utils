package indexOf;

public class Test {
	
	public static void main(String[] args) {
//		indexOf u = new indexOf();
//		String s = u.transfer("��1emkaa˵������͸�������");
//		System.out.println(s);
		String str = "110020310    ���ѧԭ�� Fundamentals of Accounting    ";
		if(str.indexOf(" ") != -1) {
			String s = str.substring(0,str.indexOf(" "));
			System.out.println(s);
		}
	}
}
