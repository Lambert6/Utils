package JDBCsqlServer;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		Connect co = new Connect();
		List<users> l = co.connSqlServer();
		int i = 1;
	    for(users u : l) {
	    	users us = new users();
	    	us.setId(u.getId());
	    	us.setUsername(u.getUsername());
	    	us.setPassword(u.getPassword());
	    	System.out.println("获取到第"+i+"个对象的"+"id为："+u.getId()+";用户名为："+u.getUsername()+";密码为："+u.getPassword());
	    	i++;
	    }
	}
}
