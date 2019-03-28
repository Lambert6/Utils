package studyThread.tongxin;

public class Storage {
	//���ݴ洢����
	private int[] cells = new int[10];
	//inPos��ʾ����ʱ�������±꣬outPos��ʾȡ��ʱ�����±�
	private int inPos,outPos;
	//����һ��put�����������������
	public void put(int num) {
		cells[inPos] = num;
		System.out.println("��cells["+inPos+"]��������---"+cells[inPos]);
		inPos++;
		if(inPos == cells.length) {
			inPos = 0;
		}
	}
	//����һ��get����ȡ������
	public void get() {
		int data = cells[outPos];
		System.out.println("��celss["+outPos+"]��ȡ������"+data);
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
