package com.mymock.ucenter.utils;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class DemoUserAccessToken {

    private static String endPointLocal =
            "http://localhost:8082/oauth/authorize?client_id=spring-rest-template&redirect_uri=rscallback&response_type=token&scope=openid&state=0.21102760625060557&demouser=3a36b20ea7a34d5282b07bcb15c651e8";
    private static String endPointRemote =
            "http://vclubrs.openscanner.cc/oauth/authorize?client_id=spring-rest-template&redirect_uri=rscallback&response_type=token&scope=openid&state=0.21102760625060557&demouser=3a36b20ea7a34d5282b07bcb15c651e8";

    private static String adminLocal =
            "http://localhost:8082/oauth/authorize?client_id=spring-rest-template&redirect_uri=rscallback&response_type=token&scope=openid&state=0.21102760625060557&demouser=174219e89c9f40c18b1839ba0deecdbb";
    private static String adminRemote =
            "http://vclubrs.openscanner.cc/oauth/authorize?client_id=spring-rest-template&redirect_uri=rscallback&response_type=token&scope=openid&state=0.21102760625060557&demouser=174219e89c9f40c18b1839ba0deecdbb";



    public static String getDemoToken(boolean local) {
        if (local) {
            return getDemoToken(endPointLocal);
        } else {
            return getDemoToken(endPointRemote);
        }
    }

    public static String getDemoToken() {
        return getDemoToken(endPointRemote);
    }

    public static String getDemoToken(String provideEndPoint) {
        try {

            CloseableHttpClient httpclient = HttpClients.createDefault();
            RequestConfig requestConfig = RequestConfig.custom().setRedirectsEnabled(false).build();
            HttpGet httpGet = new HttpGet(provideEndPoint);
            httpGet.setConfig(requestConfig);
            CloseableHttpResponse response = httpclient.execute(httpGet);
            try {
                // http://localhost:8082/oauth/rscallback#access_token=6950a90f-042b-4936-8147-c1e5fca5beee&token_type=bearer&state=0.21102760625060557&expires_in=42273
                String location = response.getFirstHeader("location").getValue();
                Optional<String[]> atk =
                        Stream.of(location.split("#")[1].split("&")).map(s -> s.split("="))
                                .filter(sa -> "access_token".equals(sa[0])).findAny();
                if (atk.isPresent()) {
                    return atk.get()[1];
                }
            } finally {
                response.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getAdminToken(boolean local) {
        if (local) {
            return getAdminToken(adminLocal);
        } else {
            return getAdminToken(adminRemote);
        }
    }

    private static String getAdminToken(String provideEndPoint) {
        return getDemoToken(provideEndPoint);
    }

//    public static void main(String... args) {
//        System.out.print(getDemoToken());
//    }
}
