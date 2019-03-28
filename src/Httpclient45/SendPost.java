package Httpclient45;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONObject;

public class SendPost {
	public static JSONObject doPost(String method, JSONObject date,HttpServletRequest request) {
		HttpClient client = HttpClients.createDefault();
		// 将接口地址和接口方法拼接起来
	    String url = "http://10.224.11.13:8080/icp1.0/" + method;
	    HttpPost post = new HttpPost(url);
	    JSONObject response = null;
	    try {
	        StringEntity s = new StringEntity(date.toString());
	        s.setContentEncoding("UTF-8");
	        s.setContentType("application/json");
	        post.setEntity(s);
	        post.addHeader("content-type", "text/xml");
	        // 调用Fa接口
	        HttpResponse res = client.execute(post);
	        if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
	            HttpEntity entity = res.getEntity();
	            String result = EntityUtils.toString(res.getEntity());// 返回json格式：
	            response = JSONObject.fromObject(result);
	            }
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	        return response;
	    
	}
	public static void main(String[] args) {
		SendPost s = new SendPost();
		//s.doPost("/getMoneyController", date, request);
	}
}
