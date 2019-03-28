package Date;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTransferDate {

	public static void main(String[] args) throws ParseException {//需要抛出转换异常
		//String s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//日期转String
		//System.out.println(s);
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2099-10-18 16:16:16");//String转日期
		System.out.println(date);
//		String q = "qqq";
//		String w = "www";
//		String e =q+w;
//		System.out.println(e);
		
	}

}
