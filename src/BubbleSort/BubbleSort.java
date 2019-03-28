package BubbleSort;

import java.math.BigDecimal;
import java.util.List;


public class BubbleSort {
	
	public static List<TableDatas> getSortByTotalScore(List<TableDatas> student4){
		//根据总分进行冒泡降序
		for (int i5 = 0; i5 < student4.size(); i5++){
			 for (int j5 = student4.size()-1; j5 > i5; j5--)  {  
				 BigDecimal x = student4.get(j5).getTotalScore();
				 BigDecimal y = student4.get(j5-1).getTotalScore();
				  if (x.compareTo(y) > 0){ 
					  TableDatas  stu = student4.get(j5);
					  student4.set(j5, student4.get(j5-1));
					  student4.set(j5-1, stu );
				  }
			 }
		}
		return student4;
	}
}
