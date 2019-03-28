package study;

import java.util.HashMap;
import java.util.Map;

public class play0319 {
	static class user{
		String name;
		int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public user(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
	}
	public static void main(String[] args) {
		user a  = new user("a",12);
		user b = new user("a",12);
		Map<String,Object> m = new HashMap<>();
		m.put("s", a);
		boolean flag = false;
		if(m.get("s").equals(a)) {
			flag = true;
		}
		System.out.println(flag);
	}
}
