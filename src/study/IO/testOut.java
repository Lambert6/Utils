package study.IO;

import java.io.FileWriter;
import java.io.IOException;

public class testOut {
	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			FileWriter  wr = new FileWriter("D:\\testIO\\testOut.dat");
			for(int i = 0 ; i < 65535 ; i++) {
				wr.write(i);
			}
			wr.close();
			System.out.println("使用了多少毫秒："+(System.currentTimeMillis() - start));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
