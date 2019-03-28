package JDBCsqlServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Conn {
	public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        DatabaseConnection databaseConnection = new DatabaseConnection();  
    }  
}
//定义一个连接数据库的类  
class DatabaseConnection  
{  
  //创建一个用于连接的对象  
  Connection ct = null;  
  //创建一个发送sql语句的对象  
  PreparedStatement ps = null;  
  //创建一个用于保存结果集的对象  
  ResultSet rs = null;  
  //构造函数  
  public DatabaseConnection()  
  {  
      try {  
          //加载驱动  
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");   
          //得到连接  
          ct = DriverManager.getConnection("jdbc:sqlserver://192.168.1.177:1433;DatabaseName=testHouse","sa","123456789");  
          //进行crud操作  
//          //增加操作  
//          ps = ct.prepareStatement("insert into student(SNo,SName) values(?,?)");  
//          ps.setString(1, "1513120188");  
//          ps.setString(2, "阿三");  
//          ps.executeUpdate();  
//            
//          //删除操作  
//          ps = ct.prepareStatement("delete from student where SName = ?");  
//          ps.setString(1, "刘猛");  
//          ps.executeUpdate();  
//            
//          //修改操作  
//          ps = ct.prepareStatement("update student set SNo = ? where SName = ?");  
//          ps.setString(1, "1");  
//          ps.setString(2, "马云");  
//          ps.executeUpdate();  
            
          //查询操作  
          ps = ct.prepareStatement("select * from guest.users");  
          //收集结果集  
          rs = ps.executeQuery();  
          //循环输出  
          int i = 1;
          while(rs.next())  
          {  
              String a = rs.getString(1);  
              String b = rs.getString(2);
              String c = rs.getString(3); 
              users u = new users();
              u.setId(a);
              u.setUsername(b);
              u.setPassword(c);
//              List<users> l = new ArrayList<users>();
//              l.add(u);             
//              for(users us : l) {
//            	  us.setId(u.getId());
//            	  us.setUsername(u.getUsername());
//            	  us.setPassword(u.getPassword());
//            	  System.out.println("第"+i+"个对象的"+"id为："+u.getId()+";用户名为："+u.getUsername()+";密码为："+u.getPassword());
//            	  ++i;
//              }
              u.getId();
          }  
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
      
  }  
}  