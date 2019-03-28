package JDBCsqlServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Connect {
	//����һ���������ӵĶ���  
	  Connection ct = null;  
	  //����һ������sql���Ķ���  
	  PreparedStatement ps = null;  
	  //����һ�����ڱ��������Ķ���  
	  ResultSet rs = null;  
	public List<users> connSqlServer(){
		 try {  
	          //��������  
	          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");   
	          //�õ�����  
	          ct = DriverManager.getConnection("jdbc:sqlserver://192.168.1.177:1433;DatabaseName=testHouse","sa","123456789");
	          //��ѯ����  
	          ps = ct.prepareStatement("select * from guest.users");  
	          //�ռ������  
	          rs = ps.executeQuery(); 
	          List<users> list = new ArrayList<users>();
	          //ѭ�����  
	          while(rs.next())  
	          {  
	              String a = rs.getString(1);  
	              String b = rs.getString(2);
	              String c = rs.getString(3); 
	              users u = new users();
	              u.setId(a);
	              u.setUsername(b);
	              u.setPassword(c);	             
	              list.add(u);	  
	          } 
	          return list;
	      } catch (Exception e) {  
	          // TODO: handle exception  
	          e.printStackTrace();  
	      }finally  
	      {  
	          //�ر���Դ  
	          try {  
	              if(rs != null)  
	              {  
	                  rs.close();  
	              }  
	              if(ps != null)  
	              {  
	                  ps.close();  
	              }  
	              if(ct != null)  
	              {  
	                  ct.close();  
	              } 
	          } catch (Exception e2) {  
	              // TODO: handle exception  
	              e2.printStackTrace();  
	          }  
	      }
		
		 return null;        
	  }  
	
	}

