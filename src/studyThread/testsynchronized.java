package studyThread;

//À¿À¯
public class testsynchronized {
	public static void main(String[] args) {
		deadLock d1 = new deadLock(true);
		deadLock d2 = new deadLock(false);
		new Thread(d1,"china").start();
		new Thread(d2,"USA").start();
	}
}

class deadLock implements Runnable{
	static Object ch = new Object();
	static Object kn = new Object();
	private boolean flag;
	
	public deadLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		if(flag) {
			while(true) {
				synchronized (ch) {
					System.out.println(Thread.currentThread().getName()+"---if---ch");
					synchronized (kn) {
						System.out.println(Thread.currentThread().getName()+"---if---kn");
					}
				}
			}
		}else {
			while(true) {
				synchronized (kn) {
					System.out.println(Thread.currentThread().getName()+"---if---kn");
					synchronized (ch) {
						System.out.println(Thread.currentThread().getName()+"---if---ch");
					}
				}
			}
		}
		
	}
	
}
