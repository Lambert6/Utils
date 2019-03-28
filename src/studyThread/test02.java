package studyThread;

public class test02 {
	public static void main(String[] args) {
		testThread02 t = new testThread02();
		Thread th = new Thread(t);
		th.start();
		while(true) {
			System.out.println("普通执行-------");
		}
	}
}

class testThread02 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("线程正在运行++++++++++++");
		}
		
	}
	
}