package study;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class file {
	public static void main(String[] args) {
		String s = File.separator;
		String path = "my1"+s+"my2";
		String filename = "testFile2.txt";
		File f = new File( filename);
		List<File> sf = new ArrayList<File>();
		if(!f.exists()) {
			//f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
