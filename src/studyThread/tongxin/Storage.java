package studyThread.tongxin;

public class Storage {
	//数据存储数组
	private int[] cells = new int[10];
	//inPos表示存入时候数组下标，outPos表示取出时数组下标
	private int inPos,outPos;
	//定义一个put方法往数组存入数据
	public void put(int num) {
		cells[inPos] = num;
		System.out.println("在cells["+inPos+"]放入数据---"+cells[inPos]);
		inPos++;
		if(inPos == cells.length) {
			inPos = 0;
		}
	}
	//定义一个get方法取出数据
	public void get() {
		int data = cells[outPos];
		System.out.println("从celss["+outPos+"]中取出数据"+data);
		outPos++;
		if(outPos == cells.length) {
			outPos = 0;
		}
	}
}

class Input implements Runnable{
	private Storage st;
	private int num;
	public Input(Storage st) {
		this.st = st;
	}
	@Override
	public void run() {
		while(true) {
			st.put(num++);
		}
		
	}	
}

class Output implements Runnable{
	private Storage st;
	
	public Output(Storage st) {
		this.st = st;
	}

	@Override
	public void run() {
		while(true) {
			st.get();
		}
		
	}
	
}
