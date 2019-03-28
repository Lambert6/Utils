package SendMsg;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;
 
/**
*短信API服务调用示例代码 － 聚合数据
*在线接口文档：http://www.juhe.cn/docs/54
**/
 
public class SendMsg {
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
 
    //配置您申请的KEY
    public static final String APPKEY ="填写自己的AppKey";
 
    //1.
    @SuppressWarnings("unchecked")
	public static boolean sendCodeMsg(String mobile,String code){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#code#="+code);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
 
    //2．
    @SuppressWarnings("unchecked")
	public static boolean sendCodeConfirmMsg(String mobile,String orderId,String orderTime){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#orderId#="+orderId+"&#orderTime#="+orderTime);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    //3.
    @SuppressWarnings("unchecked")
	public static boolean sendAllotMsg(String mobile,String orderId,String orderTime,String area){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#orderId#="+orderId+"&#orderTime#="+orderTime+"&#area#="+area);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    //4.
    @SuppressWarnings("unchecked")
	public static boolean sendNearEndDateMsg(String mobile,String realName,String endDate){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#realName#="+realName+"&#endDate#="+endDate);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    //5.
    @SuppressWarnings("unchecked")
	public static boolean sendNotEnoughMsg(String mobile,String realName,String money){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","12345");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#realName#="+realName+"&#money#="+money);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    //6.
    @SuppressWarnings("unchecked")
	public static boolean sendOrderLastDayMsg(String mobile,String orderId,String area){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#orderId#="+orderId+"&#area#="+area);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    //7.
    @SuppressWarnings("unchecked")
	public static boolean sendtookOffLastDayMsg(String mobile,String realName,String from,String to,String leaveTime,String arriveTime,String flightNo){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#realName#="+realName+"&#from#="+from+"&#to#="+to+"&#leaveTime#="+leaveTime+"&#arriveTime#="+arriveTime+"&#flightNo#="+flightNo);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    //8.
    @SuppressWarnings("unchecked")
	public static boolean sendOpenCardMsg(String mobile,String realName,String password,String cardNo){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#realName#="+realName+"&#password#="+password + "&#cardNo#="+cardNo);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    //9.
    @SuppressWarnings("unchecked")
	public static boolean sendpayMsg(String mobile,String orderId,String money){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#orderId#="+orderId+"&#money#="+money);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
  //10．
    @SuppressWarnings("unchecked")
	public static boolean sendProMsg(String mobile,String userName,String userInfo,String orderId,String createTime,String orderTime,String flightNo,String passengerInfo,Integer guestNum,String areaName){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#orderId#="+orderId+"&#userName#="+userName+"&#userInfo#="+userInfo+"&#creatTime#="+createTime+"&#orderTime#="+orderTime+"&#flightNo#="+flightNo+"&#passengerInfo#="+passengerInfo+"&#guestNum#="+guestNum+"&#areaName#="+areaName);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    
    //11．
    @SuppressWarnings("unchecked")
	public static boolean sendPushMsg1(String mobile,String userName,String cardTypeName,String cardNo,String messages){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#userName#="+userName+"&#cardTypeName#="+cardTypeName+"&#cardNo#="+cardNo+"&#messages#="+messages);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
  //12
    @SuppressWarnings("unchecked")
	public static boolean sendPushMsg2(String mobile,String userName,String cardTypeName,String cardNo,Double money,String messages){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#userName#="+userName+"&#cardTypeName#="+cardTypeName+"&#cardNo#="+cardNo+"&#money#="+money+"&#messages#="+messages);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
  //13
    @SuppressWarnings("unchecked")
	public static boolean sendPushMsg3(String mobile,String userName,String cardTypeName,String cardNo,String losetime,String messages){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#userName#="+userName+"&#cardTypeName#="+cardTypeName+"&#cardNo#="+cardNo+"&#endDate#="+losetime+"&#messages#="+messages);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
  //14
    @SuppressWarnings("unchecked")
	public static boolean sendPushMsg4(String mobile,String userName,String cardTypeName,String cardNo,Double money,String losetime,String messages){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","#userName#="+userName+"&#cardTypeName#="+cardTypeName+"&#cardNo#="+cardNo+"&#money#="+money+"&#endDate#="+losetime+"&#messages#="+messages);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
  //15
    @SuppressWarnings("unchecked")
	public static boolean sendPushMsg5(String mobile,String messages){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("mobile",mobile);//接收短信的手机号码
            params.put("tpl_id","");//短信模板ID，请参考个人中心短信模板设置
            params.put("tpl_value","&#messages#="+messages);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
                return true;
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    //2.0end09//
    
    /**
     *
     * @param strUrl 请求地址
     * @param params 请求参数
     * @param method 请求方法
     * @return  网络请求字符串
     * @throws Exception
     */
    public static String net(String strUrl, Map params,String method) throws Exception {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        String rs = null;
        try {
            StringBuffer sb = new StringBuffer();
            if(method==null || method.equals("GET")){
                strUrl = strUrl+"?"+urlencode(params);
            }
            URL url = new URL(strUrl);
            conn = (HttpURLConnection) url.openConnection();
            if(method==null || method.equals("GET")){
                conn.setRequestMethod("GET");
            }else{
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
            }
            conn.setRequestProperty("User-agent", userAgent);
            conn.setUseCaches(false);
            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
            conn.setReadTimeout(DEF_READ_TIMEOUT);
            conn.setInstanceFollowRedirects(false);
            conn.connect();
            if (params!= null && method.equals("POST")) {
                try {
                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                        out.writeBytes(urlencode(params));
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sb.append(strRead);
            }
            rs = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rs;
    }
 
    //将map型转为请求参数型
    public static String urlencode(Map<String,Object>data) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry i : data.entrySet()) {
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
    
//    public static void main(String)
    public static void main(String[] args) {
    	
    	/**
    	 * 生成随机的六位数
    	 */
    	int min = 000000;
    	int max = 999999;
    	int randNum = min + (int)(Math.random() * ((max - min) + 1));
    	System.out.println(randNum);
    	
    	/**
    	 * END
    	 */
    	
    	SendMsg.sendCodeConfirmMsg("138xxxxxxxx", "123123", "2020-10-08");
	}
    
}