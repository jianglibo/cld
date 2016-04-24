package com.mymock.webproxy.util;

import org.junit.Test;

public class RunnableTest {
    
    @Test
    public void t() throws InterruptedException {
        
        Thread main = Thread.currentThread();
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("after 2000ms");
                    main.interrupt();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
        });
        
        t1.run();
    }

}
