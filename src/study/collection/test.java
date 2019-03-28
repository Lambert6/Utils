package study.collection;

import java.util.Vector;

import suanfa.face.StrBean;

public class test {
	public static void main(String[] args) {
		Vector<StrBean> v = new Vector<>();
		v.add(new StrBean("aaa", 3));
		System.out.println(v.toString());
	}
}
