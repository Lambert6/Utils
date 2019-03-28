package test01;

public class test0222 {
	public static void main(String[] args) {
		String a = "上海市上海广中西路757号    多媒体大厦6楼\b\bb座";
		System.out.println(a.replaceAll("[^a-zA-Z0-9\\u4E00-\\u9FA5]", ""));
	}
}
