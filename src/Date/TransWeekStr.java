package Date;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TransWeekStr {
	public static void main(String[] args) {
		String a = TransWeekStr.getWeekStr("2019-03-13");//����
		System.out.println(a);
	}
	
	
	 public static Date strToDate(String strDate) {
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	   ParsePosition pos = new ParsePosition(0);
	   Date strtodate = formatter.parse(strDate, pos);
	   return strtodate;
	 }
	 
	 
	 public static String getWeek(String sdate) {
		   // ��ת��Ϊʱ��
		    Date date = TransWeekStr.strToDate(sdate);
		    Calendar c = Calendar.getInstance();
		    c.setTime(date);
		  // int hour=c.get(Calendar.DAY_OF_WEEK);
		   // hour�д�ľ������ڼ��ˣ��䷶Χ 1~7
		   // 1=������ 7=����������������
		   return new SimpleDateFormat("EEEE").format(c.getTime());
		   }
		   public static String getWeekStr(String sdate){
		   String str = "";
		    str = TransWeekStr.getWeek(sdate);
		   if("1".equals(str)){
		    str = "������";
		    }else if("2".equals(str)){
		     str = "����һ";
		    }else if("3".equals(str)){
		    str = "���ڶ�";
		   }else if("4".equals(str)){
		    str = "������";
		    }else if("5".equals(str)){
		     str = "������";
		   }else if("6".equals(str)){
		    str = "������";
		   }else if("7".equals(str)){
		   str = "������";
		   }
		   return str;
		  }
}
