package testSort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class test {
	public static void main(String[] args) {
		
		List<User> list = new ArrayList<User>();
		User u1 = new User();
		u1.setName("张三");
		u1.setAge(12);
		User u2 = new User();
		u2.setName("李四");
		u2.setAge(8);
		User u3 = new User();
		u3.setName("王二");
		u3.setAge(19);
		User u4 = new User();
		u4.setName("赵五");
		u4.setAge(21);
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		
		//使用算法，使list的元素按年龄从大到小排序
			//冒泡排序
		for (int i = 0; i < list.size(); i++){
			 for (int j = list.size()-1; j > i; j--)  {  
				 int x = list.get(j).getAge();
				 int y = list.get(j-1).getAge();
				  if (x > y){ 
					  User  stu = list.get(j);
					  list.set(j, list.get(j-1));
					  list.set(j-1, stu );
				  }
			 }
		}
		
		for(User user : list) {
			
		
			System.out.println("姓名： " + user.getName() +"-------------"  + "年龄:  " +user.getAge());
		}
		
	}
}
