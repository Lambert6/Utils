package studyThread;

public class testJoin {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new joins(),"线程1");
		t.start();
		for(int i = 1 ; i< 6 ; i++) {
			System.out.println(Thread.currentThread().getName()+"输入："+i);
			if(i == 2) {
				t.join();
			}
			Thread.sleep(500);
		}
		
	}
}

class joins implements Runnable {

	@Override
	public void run() {
		for(int i = 1 ; i< 6 ; i++) {
			System.out.println(Thread.currentThread().getName()+"输入："+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
