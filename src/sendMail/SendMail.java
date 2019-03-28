package sendMail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public static String myEmailAccount = "xxx@163.com";//�����˺�
    public static String myEmailPassword = "xxxx";//�������롣�������䣬��QQ��ʹ��SMTPʱ���е��������롣��������ֱ���õ�¼���뼴��
    //QQ��SMTP�ķ��������ʼ�Ӧ��Ϊsmtp.qq.com
    public static String myEmailSMTPHost = "smtp.163.com";
    
    public static String send(String mailAddress,String theme,String fromName,String receiveName,String content) throws Exception {
    	 // 1. ������������, ���������ʼ��������Ĳ�������
        Properties props = new Properties();                    // ��������
        props.setProperty("mail.transport.protocol", "smtp");   // ʹ�õ�Э�飨JavaMail�淶Ҫ��
        props.setProperty("mail.smtp.host", myEmailSMTPHost);   // �����˵������ SMTP ��������ַ
        props.setProperty("mail.smtp.auth", "true"); 
        //QQ����Ҫ��������һ�μ���START����ΪQQ������ҪSSL��֤
//        final String smtpPort = "465";
//        props.setProperty("mail.smtp.port", smtpPort);
//        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        props.setProperty("mail.smtp.socketFactory.fallback", "false");
//        props.setProperty("mail.smtp.socketFactory.port", smtpPort);
        //QQ����Ҫ��������һ�μ���END
        // 2. �������ô����Ự����, ���ں��ʼ�����������
        Session session = Session.getInstance(props);
        session.setDebug(true);   
        // 2.1 ����һ���ʼ�
        MimeMessage message = new MimeMessage(session);
        // 2.2 From: �����ˣ��ǳ��й�����ɣ����ⱻ�ʼ�����������Ϊ���ķ������������ʧ�ܣ����޸��ǳƣ�
        message.setFrom(new InternetAddress(myEmailAccount, fromName, "UTF-8"));
        // 2.3 To: �ռ��ˣ��������Ӷ���ռ��ˡ����͡����ͣ�
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(mailAddress, "��ɶ��", "UTF-8"));
        // 2.4 Subject: �ʼ����⣨�����й�����ɣ����ⱻ�ʼ�����������Ϊ���ķ������������ʧ�ܣ����޸ı��⣩
        message.setSubject(theme, "UTF-8");
        // 2.5 Content: �ʼ����ģ�����ʹ��html��ǩ���������й�����ɣ����ⱻ�ʼ�����������Ϊ���ķ������������ʧ�ܣ����޸ķ������ݣ�
        message.setContent(content, "text/html;charset=UTF-8");
        // 2.6 ���÷���ʱ��
        message.setSentDate(new Date());
        // 2.7 ��������
        message.saveChanges();
        // 3. ���� Session ��ȡ�ʼ��������
        Transport transport = session.getTransport();
        transport.connect(myEmailAccount, myEmailPassword);
     // 4. �����ʼ�, �������е��ռ���ַ, message.getAllRecipients() ��ȡ�������ڴ����ʼ�����ʱ��ӵ������ռ���, ������, ������
        transport.sendMessage(message, message.getAllRecipients());
        // 5. �ر�����
        transport.close();
        return mailAddress;    	
    }
   //����
    public static void main(String[] args) throws Exception {
		SendMail  s = new SendMail();
		//�����ֱ�Ϊ�ռ��������ַ���ʼ����⡢�����ˣ��ռ��ˡ��ʼ����ģ���ΪString��ʽ
		s.send("xxxx@xxx.com","����������з����ʼ�","����������","�ռ�������","��������");
	}
}
