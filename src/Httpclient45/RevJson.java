package Httpclient45;

import java.io.BufferedReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RevJson {
	/**
	 * ���մ��ݵ�json��������
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @data:���ڣ�2016��9��9��10:50:52
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
