package JDBCsqlServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Connect {
	//创建一个用于连接的对象  
	  Connection ct = null;  
	  //创建一个发送sql语句的对象  
	  PreparedStatement ps = null;  
	  //创建一个用于保存结果集的对象  
	  ResultSet rs = null;  
	public List<users> connSqlServer(){
		 try {  
	          //加载驱动  
	          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");   
	          //得到连接  
	          ct = DriverManager.getConnection("jdbc:sqlserver://192.168.1.177:1433;DatabaseName=testHouse","sa","123456789");
	          //查询操作  
	          ps = ct.prepareStatement("select * from guest.users");  
	          //收集结果集  
	          rs = ps.executeQuery(); 
	          List<users> list = new ArrayList<users>();
	          //循环输出  
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
	          //关闭资源  
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

