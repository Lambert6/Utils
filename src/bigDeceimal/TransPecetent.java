package bigDeceimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class TransPecetent {
	 public static void main(String[] args) {
		  BigDecimal a =null;
		  Integer faultRate = 6;
		  a = BigDecimal.valueOf(faultRate.doubleValue()/30);
		  BigDecimal  b =a.setScale(2, RoundingMode.HALF_UP);//������λС��
		  System.out.println("�����"+b);
		  //���潫���ת���ɰٷֱ�
		  NumberFormat percent = NumberFormat.getPercentInstance();
		       percent.setMaximumFractionDigits(2);


		       System.out.println(percent.format(b.doubleValue()));
		       String w = percent.format(b.doubleValue());
		       System.out.println("w is " + w);
		  
		}
}
