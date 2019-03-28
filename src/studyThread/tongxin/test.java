package studyThread.tongxin;

public class test {
	public static void main(String[] args) {
		Storage st = new Storage();
		Input in = new Input(st);
		Output out = new Output(st);
		new Thread(in).start();
		new Thread(out).start();
	}
}
