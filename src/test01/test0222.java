package test01;

public class test0222 {
	public static void main(String[] args) {
		String a = "�Ϻ����Ϻ�������·757��    ��ý�����6¥\b\bb��";
		System.out.println(a.replaceAll("[^a-zA-Z0-9\\u4E00-\\u9FA5]", ""));
	}
}
