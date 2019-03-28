package studyThread;

public class test01 {
	public static void main(String[] args) {
		testThread01 t = new testThread01(1);
		t.start();
		while (true) {
			System.out.println("普通运行——————————————————————");
		}
	}
}

class testThread01 extends Thread {
	int a;

	public testThread01(int a) {// 定义带参数的构造函数,达到初始化线程内变量的值
		this.a = a;
	}

	public void run() {
		while (true) {
			this.a++;
			System.out.println("线程正在运行+++++++++" + this.a++);
		}
	}
}
