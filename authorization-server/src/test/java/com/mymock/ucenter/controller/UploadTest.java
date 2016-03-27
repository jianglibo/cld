package com.mymock.ucenter.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.UUID;

import org.apache.http.HttpEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithUserDetails;

import com.mymock.ucenter.MvcHasOneUser;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;

/**
 * @author jianglibo@gmail.com
 *         在WebSecurityConfigurerAdapter的exceptionHandling,添加了ExceptionTranslationFilter。这个filter将请求导向entrypoint。 UsernamePasswordAuthenticationFilter实现验证
 *         AbstractAuthenticationProcessingFilter
 *         所以产生登陆表单的filter和验证的filter是分别配置，相互无关的。
 */

public class UploadTest extends MvcHasOneUser {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    @WithUserDetails("jianglibo@gmail.com")
    public void testUpload() throws Exception {
    	String boundary = UUID.randomUUID().toString();
        byte[] cc = null;
        try {
            cc = multiContent(boundary);
            logger.info(new String(cc));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String ct = String.format("multipart/form-data; boundary=%s", boundary); 
        
        // multipart/form-data; boundary=----WebKitFormBoundaryOc41qgsFo2aQXvuC
        // @formatter:off
        mvc.perform(
                post("/upload").with(csrf())
                .contentType(ct)
                .content(cc))
                .andExpect(status().isOk())
                .andExpect(content().json("{success: true}"))
                .andExpect(header().string("Content-Type", containsString(MediaType.APPLICATION_JSON_VALUE)));
        
        // @formatter:on

    }

    private byte[] multiContent(String boundary) throws IOException {
        StringBody comment = new StringBody("A binary file of some kind", ContentType.TEXT_PLAIN);
        FileBody bin = new FileBody(Paths.get("fixtures", "upload", "abc.txt").toFile());
        
//        MultipartFormEntity
        // @formatter:off
        HttpEntity reqEntity = MultipartEntityBuilder.create()
//                .setMode(HttpMultipartMode.RFC6532)
                .addPart("bin",bin)
                .setBoundary(boundary)
                .addPart("comment", comment).build();

//    private static final ByteArrayBuffer FIELD_SEP = encode(MIME.DEFAULT_CHARSET, ": ");
//    private static final ByteArrayBuffer CR_LF = encode(MIME.DEFAULT_CHARSET, "\r\n");
//    private static final ByteArrayBuffer TWO_DASHES = encode(MIME.DEFAULT_CHARSET, "--");
        ByteArrayOutputStream  os = new ByteArrayOutputStream();
        reqEntity.writeTo(os);
        return os.toByteArray();
        // @formatter:on
    }
}
