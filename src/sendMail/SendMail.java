package sendMail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public static String myEmailAccount = "xxx@163.com";//邮箱账号
    public static String myEmailPassword = "xxxx";//邮箱密码。部分邮箱，如QQ，使用SMTP时候有单独的密码。网易邮箱直接用登录密码即可
    //QQ的SMTP的服务器发邮件应改为smtp.qq.com
    public static String myEmailSMTPHost = "smtp.163.com";
    
    public static String send(String mailAddress,String theme,String fromName,String receiveName,String content) throws Exception {
    	 // 1. 创建参数配置, 用于连接邮件服务器的参数配置
        Properties props = new Properties();                    // 参数配置
        props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.smtp.host", myEmailSMTPHost);   // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.auth", "true"); 
        //QQ邮箱要把下面这一段加上START，因为QQ邮箱需要SSL验证
//        final String smtpPort = "465";
//        props.setProperty("mail.smtp.port", smtpPort);
//        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        props.setProperty("mail.smtp.socketFactory.fallback", "false");
//        props.setProperty("mail.smtp.socketFactory.port", smtpPort);
        //QQ邮箱要把下面这一段加上END
        // 2. 根据配置创建会话对象, 用于和邮件服务器交互
        Session session = Session.getInstance(props);
        session.setDebug(true);   
        // 2.1 创建一封邮件
        MimeMessage message = new MimeMessage(session);
        // 2.2 From: 发件人（昵称有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改昵称）
        message.setFrom(new InternetAddress(myEmailAccount, fromName, "UTF-8"));
        // 2.3 To: 收件人（可以增加多个收件人、抄送、密送）
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(mailAddress, "干啥呢", "UTF-8"));
        // 2.4 Subject: 邮件主题（标题有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改标题）
        message.setSubject(theme, "UTF-8");
        // 2.5 Content: 邮件正文（可以使用html标签）（内容有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改发送内容）
        message.setContent(content, "text/html;charset=UTF-8");
        // 2.6 设置发件时间
        message.setSentDate(new Date());
        // 2.7 保存设置
        message.saveChanges();
        // 3. 根据 Session 获取邮件传输对象
        Transport transport = session.getTransport();
        transport.connect(myEmailAccount, myEmailPassword);
     // 4. 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(message, message.getAllRecipients());
        // 5. 关闭连接
        transport.close();
        return mailAddress;    	
    }
   //测试
    public static void main(String[] args) throws Exception {
		SendMail  s = new SendMail();
		//参数分别为收件人邮箱地址、邮件主题、发件人，收件人、邮件正文，均为String格式
		s.send("xxxx@xxx.com","传入参数进行发送邮件","发件人名字","收件人名字","正文内容");
	}
}
