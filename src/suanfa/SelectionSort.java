package suanfa;

import java.util.Date;

public class SelectionSort {
	public static void main(String[] args) { 
		//选择排序，拿着第一个数，和后面的所有数比较，求最大或最小值后，与第一个值进行互换，比冒泡快5倍
        int area = 75000;
		int[] arr = new int[area];
		for(int i = 0 ; i < area ; i++) {
			arr[i] = ((int)(Math.random()*area));
		}
        //选择排序的优化
		System.out.println("开始："+new Date());
        for(int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
            int k = i;
            for(int j = k + 1; j < arr.length; j++){// 选最大或最小的记录
                if(arr[j] > arr[k]){ 
                    k = j; //记下目前找到的最大或最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换     
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;  
        }
        System.out.println("结束"+new Date());
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
    }
}
