package suanfa;

import java.util.Arrays;
import java.util.Date;

public class QuickSort {
	public static void main(String[] args) {
		int area = 30000000;
		int[] arr = new int[area];
		for(int i = 0 ; i < area ; i++) {
			arr[i] = ((int)(Math.random()*area));
		}
		System.out.println("��ʼ��"+new Date());
		Arrays.sort(arr);
		System.out.println("����"+new Date());
//		for(int num:arr){
//          System.out.print(num+" ");
//        }
	}
}
