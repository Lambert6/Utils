package studyThread;

public class testYield {
	public static void main(String[] args) {
		Thread t1 = new yield("A�̣߳�");
		Thread t2 = new yield("B�̣߳�");
		t1.start();
		t2.start();
	}
}

class yield extends Thread{
	public yield(String name) {
		super(name);//���ø���Ĺ��췽��
	}
	
	
	public void run() {
		for(int i = 0 ; i< 5 ; i++) {
			System.out.println(Thread.currentThread().getName()+"-----"+i);
			if(i == 3) {
				System.out.println("�߳��ò���");
				Thread.yield();
			}
		}
	}
}