package test01;

public class test1902201 {
	public static void main(String[] args) {
		String a = "广东省惠州惠州博罗富力现代广场G4栋负一层　0809号铺位";
		System.out.println(a.replaceAll("[　*| *| *|//s*]*", ""));
	}
}
