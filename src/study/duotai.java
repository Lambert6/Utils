package study;

public class duotai {
	static class A {
		public String show(D obj) {
			return ("A and D");
		}

		public String show(A obj) {
			return ("A and A");
		}
	}

	static class B extends A {
		public String show(B obj) {
			return ("B and B");
		}
		
		public String show(A obj) {
			return ("B and A");
		}
	}

	static class C extends B {
	}

	static class D extends B {
	}

	public static void main(String[] args) {

		A a1 = new A();

		A a2 = new B();

		B b = new B();

		C c = new C();

		D d = new D();

		System.out.println(a1.show(b)); // ¢Ù

		System.out.println(a1.show(c)); // ¢Ú

		System.out.println(a1.show(d)); // ¢Û

		System.out.println(a2.show(b)); // ¢Ü

		System.out.println(a2.show(c)); // ¢Ý

		System.out.println(a2.show(d)); // ¢Þ

		System.out.println(b.show(b)); // ¢ß

		System.out.println(b.show(c)); // ¢à

		System.out.println(b.show(d)); // ¢á

	}

}
