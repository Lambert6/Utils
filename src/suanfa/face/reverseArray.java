package suanfa.face;

import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args) {
		int[] a = new int[]{(int)(Math.random()*100),
							(int)(Math.random()*100),
							(int)(Math.random()*100),
							(int)(Math.random()*100),
							(int)(Math.random()*100)};
		System.out.println(Arrays.toString(a));
		for(int i = 0 ; i < a.length / 2 ; i++) {
			int tem = a[i];
			a[i] = a[a.length -1 -i];
			a[a.length -1 -i] = tem;
		}
		System.out.println(Arrays.toString(a));
	}
}
