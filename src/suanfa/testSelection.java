package suanfa;

import java.util.Date;

public class testSelection {
	public static void main(String[] args) {
		int area = 300000;
		int[] arr = new int[area];
		for(int i = 0 ; i < area ; i++) {
			arr[i] = ((int)(Math.random()*area));
		}
		System.out.println("��ʼ��"+new Date());
		for(int i = 0 ; i < arr.length -1; i++) {
			int k = i ;
			for(int j = k+1; j < arr.length; j++) {
				if(arr[k] < arr[j]) {//��������Сֵ
					k = j;
				}
			}
			int f = arr[k];
			arr[k] = arr[i];
			arr[i] = f;
		}
		System.out.println("����"+new Date());
//		for(int num:arr){
//            System.out.print(num+" ");
//        }
	}
}
