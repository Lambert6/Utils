package Httpclient45;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class SendGet {
	
	public String getMoney(String appid, String secret, String js_code, HttpServletRequest request,
			HttpServletResponse response) {	
		String str = null;
	    try {	        
	        HttpClient httpclient = HttpClients.createDefault();
	        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appid + "&secret=" + secret + "&grant_type=authorization_code&js_code=" + js_code ;
	        HttpGet getmethod = new HttpGet(url);
	        HttpResponse resp = httpclient.execute(getmethod);
	        str = EntityUtils.toString(resp.getEntity());//返回为json格式
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		return str;//返回的一个字符串，内容是json格式
	}	
	public static void main(String[] args) {
		String str = null;
		String appid = "adasd";
		String secret = "asdsadas";
		String js_code = "asdsadas";
	    try {	        
	        HttpClient httpclient = HttpClients.createDefault();
	        String url = "http://api.weixin.qq.com/sns/jscode2session?appid=" + appid + "&secret=" + secret + "&grant_type=authorization_code&js_code=" + js_code ;
	        HttpGet getmethod = new HttpGet(url);
	        HttpResponse resp = httpclient.execute(getmethod);
	        str = EntityUtils.toString(resp.getEntity(),"UTF-8");//返回为json格式
	        System.out.println(str);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		
	}
}
