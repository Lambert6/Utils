package Httpclient45;

import java.io.BufferedReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RevJson {
	/**
	 * 接收传递的json参数解析
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @data:日期：2016年9月9日10:50:52
	 */
	//@RequestMapping("/getJson")
	public String getJson(HttpServletRequest request,
	        HttpServletResponse response) {
	    StringBuffer json = new StringBuffer();
	    String line = null;
	    try {
	        BufferedReader reader = request.getReader();
	        while ((line = reader.readLine()) != null) {
	            System.out.println("line:" + line);
	            json.append(line);
	        }
	    } catch (Exception e) {
	        System.out.println(e.toString());

	    }
	    System.out.println(json.toString());
	    return json.toString();
	}
}
