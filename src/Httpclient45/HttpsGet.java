package Httpclient45;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;



import java.io.IOException;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.SSLContext;


public class HttpsGet {
	
    public static CloseableHttpClient createSSLClientDefault() {
        try {
            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null,
                    new TrustStrategy() {
                        //信任所有
                        public boolean isTrusted(X509Certificate[] chain,
                            String authType) throws CertificateException {
                            return true;
                        }
                    }).build();
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);

            return HttpClients.custom().setSSLSocketFactory(sslsf).build();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }

        return HttpClients.createDefault();
    }

    public static void main(String[] args)throws ClientProtocolException, IOException {
    	 String appid="MIE8J7RKQLSSPZGL";
    	 String loginUrl = "https://cas.gzittc.com/safe/getUserInfo";
    	 String nowTime = new SimpleDateFormat("yyyyMMdd").format(new Date());//日期转String
    	 String username = "199307102";
    	 MD5Util md5=new MD5Util();
    	 String secret = md5.getkeyBeanofStr(username + appid + nowTime);
    	CloseableHttpClient httpclient = createSSLClientDefault();
        HttpGet getmethod = new HttpGet(loginUrl+"?appid="+appid+"&username="+username+"&secret="+secret);
        CloseableHttpResponse resp = httpclient.execute(getmethod);
        String strJson = EntityUtils.toString(resp.getEntity(), "utf-8");
        System.out.println(strJson);
    }
}
