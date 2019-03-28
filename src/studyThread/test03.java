package studyThread;

import java.util.Timer;
import java.util.TimerTask;

import suanfa.face.StrBean;

public class test03 {
	public static void timer1() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println("-------设定要指定任务--------");
				System.gc();
			}
		}, 5000);// 设定指定的时间time,此处为2000毫秒
		//timer.cancel();
	}

	public static void main(String[] args) {
		ticket t = new ticket();
//		new Thread(t,"窗口1").start();
//		new Thread(t,"窗口2").start();
//		new Thread(t,"窗口3").start();
//		new Thread(t,"窗口4").start();
		Thread t1 = new Thread(t, "窗口1");
		t1.setDaemon(true);//将t1线程设置为后台线程
		t1.start();
		Thread t2 = new Thread(t, "窗口2");
		t2.setDaemon(true);//将t1线程设置为后台线程
		t2.start();
		timer1();//当前台线程运行完毕，那么后台线程也会停止
	}
}

class ticket implements Runnable {

	int t = 100;
	int i = 0;
	Object lock = new Object();//锁对象可以试任意类型的，只要在run方法外面定义即可
	@Override
	public void run() {
		while (true) {
			synchronized (lock) {//线程同步，票数顺序递减
				Thread th = Thread.currentThread();// 获取当前线程
				if (t > 0) {
					String thName = th.getName();
					System.out.println(thName + "正在发售第:  " + t-- + "  张票");
					i++;
					// System.out.println(i);
				}
			}
			

		}

	}

}