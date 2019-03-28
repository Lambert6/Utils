//package BubbleSort;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class FastSort {
//	public static List<TableDatas> getFastSort(List<TableDatas> a , int b, int c){
//		 int start = b;
//         int end = c;
//         double key = a.get(b).getTotalScore().doubleValue();
//
//         while(end>start){
//        	 //从后往前比较
//             while(end>start&&a.get(end).getTotalScore().doubleValue()>=key) {   //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
//            	 end--;
//             }
//             if(a.get(end).getTotalScore().doubleValue()<=key){
//            	 TableDatas temp = a.get(end);
////            	 a.get(end) = a.get(start);
////            	 a.get(start) = temp;
//             }
//             
//         }
//		return null;		
//	}
//	
//	public static List<TableDatas> getFastSort2(List<TableDatas> a , int b, int c){
//		Collections.sort(a, new Comparator<TableDatas>() {
//
//			 @Override
//	            public int compare(TableDatas p1, TableDatas p2) {
//				 if(p1.getTotalScore().doubleValue()>p2.getTotalScore().doubleValue()){
//	                    return 1;
//	                } else if(p1.getTotalScore().doubleValue()<p2.getTotalScore().doubleValue()){
//	                    return 0;
//	                }
//			 }
//			
//		 });
//		return a;
//		
//	}
//}
