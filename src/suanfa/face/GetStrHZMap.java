package suanfa.face;

import java.util.HashMap;
import java.util.Map;

public class GetStrHZMap {
	public static void main(String[] args) {
		String str = "asdascsdfcsfdasfasdfwea";
		Map<String, Integer> m = new HashMap<String, Integer>();
		for(int i = 0 ; i < str.length() ; i ++) {
			String tem = String.valueOf(str.charAt(i));
			if(m.containsKey(tem)) {
				m.put(tem, m.get(tem) + 1);
			}else {
				m.put(tem, 1);
			}
		}
		Integer temp = 0;
		for(Integer in : m.values()) {
			if(in > temp) {
				temp = in;
			}
		}
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
	      if(entry.getValue().equals(temp)) {
	    	  System.out.println("元素名为：" +entry.getKey()+ "  值为："+entry.getValue());
	      }
	    }
		
	}
}
