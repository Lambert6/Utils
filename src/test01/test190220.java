package test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test190220 {
	public static void main(String[] args) throws ParseException {
		String a = "2008/10/12";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse(a);
		System.out.println(date);
	}
}
