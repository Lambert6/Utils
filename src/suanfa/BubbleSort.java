package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BubbleSort {
	public static void main(String[] args) {
		int area = 40000;
		List<Integer> a = new ArrayList<Integer>();
		for(int i = 0 ; i < area ; i++) {
			a.add((int)(Math.random()*area));
		}
		System.out.println("¿ªÊ¼£º"+new Date());
		for(int i = 0 ; i < a.size() -1 ; i++) {
			for(int j = 0; j < a.size() -1 - i ; j++) {
				if(a.get(j) < a.get(j+1) ) {
					int f = a.get(j+1);
					a.set(j+1, a.get(j));
					a.set(j, f);
				}
			}
		}
		System.out.println("½áÊø"+new Date());
//		for(int s : a) {
//			System.out.print(s+",");
//		}
	}
}
