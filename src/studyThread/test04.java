package studyThread;

public class test04 {
	public static void main(String[] args) {
		Thread min = new Thread(new minThread(), "低优先的线程");
		Thread max = new Thread(new maxThread(), "很高的线程");
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(10);
		max.start();
		min.start();
		
	}
}


class maxThread implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName()+"正在输出"+i);
		}
		
	}
	
}

class minThread implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName()+"正在输出"+i);
		}
		
	}
	
}
