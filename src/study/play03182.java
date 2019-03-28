package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class play03182 {
	public static void main(String[] args) {
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		String s = null;
		try {
			s = b.readLine();
			while (s != null) {
				if (s.equalsIgnoreCase("exit")) {
					break;
				} else {
					System.out.println(s.toUpperCase());
					s = b.readLine();
				}
			}
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
