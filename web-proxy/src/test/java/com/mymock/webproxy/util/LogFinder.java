/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.util;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * @author jianglibo@gmail.com
 *         2016年4月26日
 *
 */
public class LogFinder {
    
    private String s = "sqgk/request_dispatch.jsp?url=applyform_add_dowith.jsp";
    private String sample = "10.74.111.24 - - [23/Feb/2015:17:24:55 +0800] \"POST /wcm/services/sqgk/request_dispatch.jsp?url=applyform_add_dowith.jsp HTTP/1.0\" 502 383 \"-\" \"Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2)\"";
    private Pattern ptn = Pattern.compile(".*2016:.*POST.*/sqgk/request_dispatch.jsp\\?url=applyform_add_dowith.jsp.*");
    
    @Test
    public void pattern() {
        assertTrue("should match.", ptn.matcher(sample).matches());
    }

    @Test
    public void t() throws IOException {
        Path dst = Paths.get("fixturesout", "2015.txt");
        Writer wr = Files.newBufferedWriter(dst);
        long start = System.currentTimeMillis();
        Files.lines(Paths.get("e:","access.log")).filter(line -> {
            return ptn.matcher(line).matches();
        }).forEach(line -> {
            try {
                wr.write(line);
                wr.write("\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        wr.flush();
        wr.close();
        System.out.println("costs: " + ((System.currentTimeMillis() - start)/1000) + " s");
    }
}
