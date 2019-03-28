package suanfa.face;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import net.sf.json.JSONArray;

public class testJDKSort {
	public static void main(String[] args) {
		List<StrBean> sList = new ArrayList<>();
		StrBean s1 = new StrBean("a",5);
		StrBean s2 = new StrBean("s",21);
		StrBean s3 = new StrBean("d",12);
		StrBean s4 = new StrBean("b",6);
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		Collections.sort(sList, new Comparator<StrBean>() {
			public int compare(StrBean o1, StrBean o2) {
				//原理是先用迭代器进行遍历，顺序拿出元素。若二者相减（String 类型使用 compareTo方法）大于0则交换位置，小于或等于0，则不变。
				return o1.getHz() - o2.getHz();
			}
		});
		System.out.println(JSONArray.fromObject(sList));
	}
}
