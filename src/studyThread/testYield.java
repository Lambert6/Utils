package studyThread;

public class testYield {
	public static void main(String[] args) {
		Thread t1 = new yield("A线程：");
		Thread t2 = new yield("B线程：");
		t1.start();
		t2.start();
	}
}

class yield extends Thread{
	public yield(String name) {
		super(name);//调用父类的构造方法
	}
	
	
	public void run() {
		for(int i = 0 ; i< 5 ; i++) {
			System.out.println(Thread.currentThread().getName()+"-----"+i);
			if(i == 3) {
				System.out.println("线程让步：");
				Thread.yield();
			}
		}
	}
}