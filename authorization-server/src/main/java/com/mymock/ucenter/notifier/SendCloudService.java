package com.mymock.ucenter.notifier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class SendCloudService {

    private final String sendUrl = "http://sendcloud.sohu.com/webapi/mail.send_template.json";
    
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    private ObjectMapper objectMapper;

    // curl -F api_user='***' -F api_key='***' -F from='test@test.com' -F fromname='来自测试发送' -F subject=' 测试' -F template_invoke_name='ifaxin_bill' -F
    // substitution_vars='{"to": ["ben@ifaxin.com", "joe@ifaxin.com"],"sub":{"%name%": ["Ben", "Joe"],"%money%":[288, 497]}}' -F replyto='reply@test.com' -F
    // resp_email_id='true' -F files=@/path/attach.pdf http://sendcloud.sohu.com/webapi/mail.send_template.json
    

    public boolean sendEmail(SendCloudTemplate sct) throws ClientProtocolException, IOException {
        String result = send(sendUrl, sct.createPostForm().build()); 
        JsonNode jn = objectMapper.readTree(result);
        
        if (!"success".equalsIgnoreCase(jn.get("message").asText())) {
            logger.info("send mail to {} fail. {}",String.join(",", sct.getStvs().getTo()), result);
            return false;
        }
        return true;
    }

    private String send(String url, List<NameValuePair> urlParameters) throws IOException {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost(url);
        CloseableHttpResponse response = null;

        try {
            httppost.setEntity(new UrlEncodedFormEntity(urlParameters, StandardCharsets.UTF_8));

            response = httpclient.execute(httppost);

            return EntityUtils.toString(response.getEntity());

        } finally {
            if (response != null) {
                response.close();
            }
        }
    }
    
    public SendCloudService setOm(ObjectMapper om){
        this.objectMapper = om;
        return this;
    }
}
