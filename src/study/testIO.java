package study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;

public class testIO {
	public static void main(String[] args) {
		int b = 0 ;
		byte[] arr=new byte[100];
		try {
			FileInputStream in = new FileInputStream ("D:\\testIO\\a1.txt");
			try {
				while((b = in.read(arr)) != -1) {
					System.out.println(new String(arr,0,b));
				}
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
