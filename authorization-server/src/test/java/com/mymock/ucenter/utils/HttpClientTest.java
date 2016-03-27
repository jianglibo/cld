package com.mymock.ucenter.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpClientTest {
    
    
    private CloseableHttpClient client = HttpClients.createDefault();

    /*
     * Using the AddPart Method
     * Uploading a Form with Two Text Parts and a File
     */
    public void p1() throws ClientProtocolException, IOException {
        File file = new File("textFileName"); //, ContentType.DEFAULT_BINARY);
        HttpPost post = new HttpPost("http://echo.200please.com");
        FileBody fileBody = new FileBody(file);
        StringBody stringBody1 = new StringBody("Message 1", ContentType.MULTIPART_FORM_DATA);
        StringBody stringBody2 = new StringBody("Message 2", ContentType.MULTIPART_FORM_DATA);
        // 
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        builder.addPart("upfile", fileBody);
        builder.addPart("text1", stringBody1);
        builder.addPart("text2", stringBody2);
        HttpEntity entity = builder.build();
        //
        post.setEntity(entity);
        HttpResponse response = client.execute(post);
    }
    
    /*
     * Using the addBinaryBody and addTextBody Methods
     * Uploading Text and a Text File Part
     */
    public void p2() throws ClientProtocolException, IOException {
        HttpPost post = new HttpPost("http://echo.200please.com");
        File file = new File("textFileName");
        String message = "This is a multipart post";
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        builder.addBinaryBody("upfile", file, ContentType.DEFAULT_BINARY, "textFileName");
        builder.addTextBody("text", message, ContentType.DEFAULT_BINARY);
        // 
        HttpEntity entity = builder.build();
        post.setEntity(entity);
        HttpResponse response = client.execute(post);
    }
    
    /*
     * Uploading a Zip File, an Image File and a Text Part
     */
    public void p3() throws ClientProtocolException, IOException {
        HttpPost post = new HttpPost("http://echo.200please.com");
        InputStream inputStream = new FileInputStream("zipFileName");
        File file = new File("imageFileName");
        String message = "This is a multipart post";
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();         
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        builder.addBinaryBody
          ("upfile", file, ContentType.DEFAULT_BINARY, "imageFileName");
        builder.addBinaryBody
          ("upstream", inputStream, ContentType.create("application/zip"), "zipFileName");
        builder.addTextBody("text", message, ContentType.TEXT_PLAIN);
        // 
        HttpEntity entity = builder.build();
        post.setEntity(entity);
        HttpResponse response = client.execute(post);
    }
    /*
     * Uploading a Byte Array and Text
     */
    public void p4() throws ClientProtocolException, IOException {
        String message = "This is a multipart post";
        byte[] bytes = "binary code".getBytes(); 
        // 
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        builder.addBinaryBody("upfile", bytes, ContentType.DEFAULT_BINARY, "textFileName");
        builder.addTextBody("text", message, ContentType.TEXT_PLAIN);
        // 
        HttpEntity entity = builder.build();
        HttpPost httppost = new HttpPost("http://localhost/action.do");
        httppost.setEntity(entity);
        HttpResponse response = client.execute(httppost);
    }
}
