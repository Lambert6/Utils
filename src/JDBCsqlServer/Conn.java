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
//����һ���������ݿ����  
class DatabaseConnection  
{  
  //����һ���������ӵĶ���  
  Connection ct = null;  
  //����һ������sql���Ķ���  
  PreparedStatement ps = null;  
  //����һ�����ڱ��������Ķ���  
  ResultSet rs = null;  
  //���캯��  
  public DatabaseConnection()  
  {  
      try {  
          //��������  
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");   
          //�õ�����  
          ct = DriverManager.getConnection("jdbc:sqlserver://192.168.1.177:1433;DatabaseName=testHouse","sa","123456789");  
          //����crud����  
//          //���Ӳ���  
//          ps = ct.prepareStatement("insert into student(SNo,SName) values(?,?)");  
//          ps.setString(1, "1513120188");  
//          ps.setString(2, "����");  
//          ps.executeUpdate();  
//            
//          //ɾ������  
//          ps = ct.prepareStatement("delete from student where SName = ?");  
//          ps.setString(1, "����");  
//          ps.executeUpdate();  
//            
//          //�޸Ĳ���  
//          ps = ct.prepareStatement("update student set SNo = ? where SName = ?");  
//          ps.setString(1, "1");  
//          ps.setString(2, "����");  
//          ps.executeUpdate();  
            
          //��ѯ����  
          ps = ct.prepareStatement("select * from guest.users");  
          //�ռ������  
          rs = ps.executeQuery();  
          //ѭ�����  
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
//            	  System.out.println("��"+i+"�������"+"idΪ��"+u.getId()+";�û���Ϊ��"+u.getUsername()+";����Ϊ��"+u.getPassword());
//            	  ++i;
//              }
              u.getId();
          }  
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
      
  }  
}  