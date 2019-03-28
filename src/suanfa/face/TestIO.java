package suanfa.face;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestIO {
	public static void main(String[] args) {
		File f = new File("D:\\testIO\\c1.txt");
		try {
			f.createNewFile();
			FileReader fr = new FileReader("D:\\testIO\\a1.txt");
			FileWriter fw = new FileWriter("D:\\testIO\\c1.txt");
			int ch=0;
			while((ch=fr.read())!=-1){
				fw.write((char) ch);
				System.out.println("ch="+(char)ch);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
