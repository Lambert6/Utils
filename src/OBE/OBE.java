package OBE;

import java.util.ArrayList;
import java.util.List;

public class OBE {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String a = "武汉";
		String b = "杭州";
		String c = "郑州";
		String d = "北京";
		String e = "上海";
		String f = "广州";
		String g = "深圳";
		String h = "合肥";
		String i = "哈尔滨";
		String j = "乌鲁木齐";
		String k = "拉萨";
		String l = "西宁";
		String m = "银川";
		String n = "西安";
		String o = "南昌";
		String p = "长沙";
		String q = "石家庄";
		String r = "福州";
		String s = "昆明";
		String t = "成都";
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		list.add(g);
		list.add(h);
		list.add(i);
		list.add(j);
		list.add(k);
		list.add(l);
		list.add(m);
		list.add(n);
		list.add(o);
		list.add(p);
		list.add(q);
		list.add(r);
		list.add(s);
		list.add(t);
		
		int length = 20;
		String shu = "";
		for(int x = 1 ; x <= length ; x++ ) {
			int ui = (int)(1+Math.random()*19);
			String tem = list.get(ui);
			tem = "," + "'" +tem + "'";
			shu = tem + shu ;
		}
		System.out.println(shu);
	}
}
