package OBE;

import java.util.ArrayList;
import java.util.List;

public class OBE {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String a = "�人";
		String b = "����";
		String c = "֣��";
		String d = "����";
		String e = "�Ϻ�";
		String f = "����";
		String g = "����";
		String h = "�Ϸ�";
		String i = "������";
		String j = "��³ľ��";
		String k = "����";
		String l = "����";
		String m = "����";
		String n = "����";
		String o = "�ϲ�";
		String p = "��ɳ";
		String q = "ʯ��ׯ";
		String r = "����";
		String s = "����";
		String t = "�ɶ�";
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
