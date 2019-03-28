package jdk18;

import java.util.Comparator;

public class hanshu {
	public static void main(String[] args) {
		int a = 6;
		int s = 1;
		System.out.println(Integer.compare(s, a));
		Comparator<Integer> cpt2 = (x,y) -> Integer.compare(x,y);
	}
}
