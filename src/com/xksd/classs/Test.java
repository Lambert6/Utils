package com.xksd.classs;

//import net.sf.json.JSONObject;

public class Test {
	String name;
	int age;
	String sex;
	int weight;
	int height;
	
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static void main(String[] args) {
		Test zhangc = new Test();
		zhangc.setName("ÕÅè¡");
		zhangc.setAge(16);
		zhangc.setHeight(170);
		zhangc.setSex("ÄÐ");
		zhangc.setWeight(60);
		System.out.println(zhangc.toString());
		//JSONObject json = new JSONObject();
		
	}
}
