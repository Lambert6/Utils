package studyThread;

import java.util.Timer;
import java.util.TimerTask;

import suanfa.face.StrBean;

public class test03 {
	public static void timer1() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println("-------�趨Ҫָ������--------");
				System.gc();
			}
		}, 5000);// �趨ָ����ʱ��time,�˴�Ϊ2000����
		//timer.cancel();
	}

	public static void main(String[] args) {
		ticket t = new ticket();
//		new Thread(t,"����1").start();
//		new Thread(t,"����2").start();
//		new Thread(t,"����3").start();
//		new Thread(t,"����4").start();
		Thread t1 = new Thread(t, "����1");
		t1.setDaemon(true);//��t1�߳�����Ϊ��̨�߳�
		t1.start();
		Thread t2 = new Thread(t, "����2");
		t2.setDaemon(true);//��t1�߳�����Ϊ��̨�߳�
		t2.start();
		timer1();//��ǰ̨�߳�������ϣ���ô��̨�߳�Ҳ��ֹͣ
	}
}

class ticket implements Runnable {

	int t = 100;
	int i = 0;
	Object lock = new Object();//������������������͵ģ�ֻҪ��run�������涨�弴��
	@Override
	public void run() {
		while (true) {
			synchronized (lock) {//�߳�ͬ����Ʊ��˳��ݼ�
				Thread th = Thread.currentThread();// ��ȡ��ǰ�߳�
				if (t > 0) {
					String thName = th.getName();
					System.out.println(thName + "���ڷ��۵�:  " + t-- + "  ��Ʊ");
					i++;
					// System.out.println(i);
				}
			}
			

		}

	}

}