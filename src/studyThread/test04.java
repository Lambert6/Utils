package studyThread;

public class test04 {
	public static void main(String[] args) {
		Thread min = new Thread(new minThread(), "�����ȵ��߳�");
		Thread max = new Thread(new maxThread(), "�ܸߵ��߳�");
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
			System.out.println(Thread.currentThread().getName()+"�������"+i);
		}
		
	}
	
}

class minThread implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName()+"�������"+i);
		}
		
	}
	
}
