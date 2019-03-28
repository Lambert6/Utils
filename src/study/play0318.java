package study;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class play0318 {
	public static void main(String[] args) {
	  InputStreamReader f = new InputStreamReader(System.in);
	  BufferedReader b = new BufferedReader(f); 
	  try {
		while(b.readLine() != null ) {
			if(b.readLine().equals("exit")) {
				break;
			}else {
				System.out.println(b.readLine());
			}  
		}
		b.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
