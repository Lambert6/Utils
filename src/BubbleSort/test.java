package BubbleSort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class test {
	public static void main(String[] args) {
		List<TableDatas>  a = new ArrayList<TableDatas>();
		for(int i = 1; i <= 80000; i=i+3) {
			int random = (int)Math.random();
			TableDatas b = new TableDatas();
			b.setStuname("第"+i+"人  ");
			b.setTotalScore(new BigDecimal(random));
			a.add(b);
		}
		List<TableDatas>  wDatas = new ArrayList<TableDatas>();
		wDatas.addAll(a);
		System.out.println("要排序的List的长度："+a.size());
		System.out.println("Bubble开始： "+new Date());
		a = BubbleSort.getSortByTotalScore(a);
		System.out.println("Bubble完成： "+new Date());
		System.out.println("-------------------------");
		System.out.println("FastSort开始"+new Date());
		//wDatas = FastSort.getFastSort(wDatas, 0, wDatas.size() - 1);
		System.out.println("FastSort完成"+new Date());
//		for(TableDatas c : a) {
//			System.out.println(c.getStuname());
//			System.out.println(c.getTotalScore());
//			System.out.println("-----------");  
//		}
		
	}
}
