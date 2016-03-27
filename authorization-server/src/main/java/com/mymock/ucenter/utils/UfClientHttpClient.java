
package com.mymock.ucenter.utils;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * 
 * @author jianglibo@gmail.com
 * 2015年7月14日
 *
 */
public final class UfClientHttpClient {

    private static enum Singleton {
        // Just one of me so constructor will be called once.
        Client;
        // The thread-safe client.
        private final CloseableHttpClient threadSafeClient;

        // The constructor creates it - thus late
        private Singleton() {
            threadSafeClient = HttpClients.custom().setMaxConnTotal(30).setMaxConnPerRoute(30).build();
        }

        public CloseableHttpClient get() {
            return threadSafeClient;
        }

    }

    public static CloseableHttpClient get() {
        return Singleton.Client.get();
    }
}
