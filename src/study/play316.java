package study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class play316 {
	public static void main(String[] args) {
		String str = "asdascsdfcsfdasfasdfwea";
		Map<Character,Integer> m = new HashMap<>();
		for(int i = 0 ; i < str.length() ; i ++) {
			Character tem = str.charAt(i);
			if(m.containsKey(tem)) {
				m.put(tem, m.get(tem)+1);
			}else {
				m.put(tem, 1);
			}
		}
		 List<Map.Entry<String,Integer>> list = new ArrayList<>((Collection<? extends Entry<String, Integer>>) m.entrySet());
	        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
	            //…˝–Ú≈≈–Ú
	            public int compare(Entry<String, Integer> o1,
	                    Entry<String, Integer> o2) {
	                return o2.getValue()-(o1.getValue());
	            }

	        });
	        System.out.println(list.toString());
	}
}
