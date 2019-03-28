package study;

import java.util.HashMap;
import java.util.Map;

public class play0315 {
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
		Integer in = 0;
		for(Map.Entry<Character, Integer> p : m.entrySet()) {
			if(p.getValue() > in) {
				in = p.getValue() ;
			}
		}
		for(Map.Entry<Character, Integer> p : m.entrySet()) {
			if(p.getValue().equals(in)) {
				System.out.println(p.getKey()+""+p.getValue());
			}
		}
		
		
		System.out.println(m.toString());
		
	}
}
