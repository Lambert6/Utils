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
	    	System.out.println("��ȡ����"+i+"�������"+"idΪ��"+u.getId()+";�û���Ϊ��"+u.getUsername()+";����Ϊ��"+u.getPassword());
	    	i++;
	    }
	}
}
