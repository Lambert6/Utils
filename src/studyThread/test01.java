package studyThread;

public class test01 {
	public static void main(String[] args) {
		testThread01 t = new testThread01(1);
		t.start();
		while (true) {
			System.out.println("��ͨ���С�������������������������������������������");
		}
	}
}

class testThread01 extends Thread {
	int a;

	public testThread01(int a) {// ����������Ĺ��캯��,�ﵽ��ʼ���߳��ڱ�����ֵ
		this.a = a;
	}

	public void run() {
		while (true) {
			this.a++;
			System.out.println("�߳���������+++++++++" + this.a++);
		}
	}
}
