package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import sun.security.util.Length;

public class test01 {
	public static void main(String[] args) {
		//确定i的循环次数，然后每次第J个元素和第J+1个元素相比大小，进行互换，将最大或者最小值放到最后面，
		//所以，没循环一次I，就减少一个J的循环次数，要在J的地方 每次减I
		int area = 75000;
		int[] a = new int[area];
		for(int i = 0 ; i < area ; i++) {
			a[i] = ((int)(Math.random()*area));
		}
		System.out.println("开始："+new Date());
		for(int i = 0 ; i < a.length -1 ; i++) {
			for(int j = 0; j < a.length -1 - i ; j++) {
				if(a[j] < a[j+1]) {
					int f = a[j];
					a[j] = a[j+1];
					a[j+1] = f; 
				}
			}
		}
		System.out.println("结束"+new Date());
//		for(int s : a) {
//			System.out.print(s+",");
//		}
		
	}
}
