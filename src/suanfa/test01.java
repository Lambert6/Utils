package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import sun.security.util.Length;

public class test01 {
	public static void main(String[] args) {
		//ȷ��i��ѭ��������Ȼ��ÿ�ε�J��Ԫ�غ͵�J+1��Ԫ����ȴ�С�����л���������������Сֵ�ŵ�����棬
		//���ԣ�ûѭ��һ��I���ͼ���һ��J��ѭ��������Ҫ��J�ĵط� ÿ�μ�I
		int area = 75000;
		int[] a = new int[area];
		for(int i = 0 ; i < area ; i++) {
			a[i] = ((int)(Math.random()*area));
		}
		System.out.println("��ʼ��"+new Date());
		for(int i = 0 ; i < a.length -1 ; i++) {
			for(int j = 0; j < a.length -1 - i ; j++) {
				if(a[j] < a[j+1]) {
					int f = a[j];
					a[j] = a[j+1];
					a[j+1] = f; 
				}
			}
		}
		System.out.println("����"+new Date());
//		for(int s : a) {
//			System.out.print(s+",");
//		}
		
	}
}
