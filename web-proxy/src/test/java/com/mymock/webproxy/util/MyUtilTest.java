package com.mymock.webproxy.util;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;

import org.junit.Test;

public class MyUtilTest {
    
    
    
    
    @Test
    public void split() {
        assertThat("/".split("/").length, equalTo(0));
        Path p = Paths.get("", new String[]{});
        assertThat(String.join("/", "/".split("/")), equalTo(""));
        
        assertThat("/a".split("/").length, equalTo(2));
        
        int key = 0;
        switch (key) {
        case 0:
            break;
        default:
            break;
        }
        
        String skey = "";
        switch (skey) {
        case "":
            
            break;

        default:
            break;
        }
    }
    
    @Test
    public void urlEqual() throws MalformedURLException {
        URL url1 = new URL("http://aaa.cc/?abc=u");
        URL url2 = new URL("http://aaa.cc/");
        
        assertFalse(url1.equals(url2));
        
        url1 = new URL("http://aaa.cc/");
        url2 = new URL("http://aaa.cc/?");
        
        assertFalse(url1.equals(url2));
    }
    
    @Test
    public void isFileLike() {
        assertTrue(MyUtil.isFileLike("http://www.abc.cc/a.txt"));
        assertTrue(MyUtil.isFileLike("http://repo.mysql.com/yum/mysql-connectors-community/el/7/x86_64/repodata/95754e998234a34bd078685b9688a2ff652c0bbe-primary.sqlite.bz2"));
        assertFalse(MyUtil.isFileLike("http://www.abc.cc/a"));
        assertFalse(MyUtil.isFileLike("http://www.abc.cc/a.txt?k=v"));
        assertFalse(MyUtil.isFileLike("http://www.abc.cc/a.txt?"));
    }
    
    @Test
    public void extractFileName() {
        assertThat(Arrays.asList(MyUtil.extractFileName("http://ww.abc.cc/a.txt")), contains("a.txt"));
        assertThat(Arrays.asList(MyUtil.extractFileName("http://ww.abc.cc/a")), empty());
        assertThat(Arrays.asList(MyUtil.extractFileName("http://ww.abc.cc/a.txt?k=v")), empty());
        assertThat(Arrays.asList(MyUtil.extractFileName("http://ww.abc.cc/a.txt?")), empty());
    }
    
    @Test
    public void subsParam() {
        String qs = "a=b&host=565";
        String after = MyUtil.subsParameter(qs, "host");
        assertThat(after, equalTo("a=b"));

        qs = "a=b&host=565&x=u";
        after = MyUtil.subsParameter(qs, "host");
        assertThat(after, equalTo("a=b&x=u"));
        
        qs = "host=565";
        after = MyUtil.subsParameter(qs, "host");
        assertThat(after, equalTo(""));
        
        qs = "host=";
        after = MyUtil.subsParameter(qs, "host");
        assertThat(after, equalTo("host"));
    }
    
    @Test
    public void serverIps() {
        Set<String> ips = MyUtil.getServerIps();
        ips.forEach(ip -> {
            System.out.println(ip);
        });
    }
    
    @Test
    public void port() throws MalformedURLException {
        URL url = new URL("http://www.fh.gov.cn");
        
        assertThat(url.getPort(), equalTo(-1));
        
        url = MyUtil.changePort(url, -1);
        
        assertThat(url.toString(), equalTo("http://www.fh.gov.cn"));
        
    }
    
    @Test
    public void subParams() throws MalformedURLException {
        String qs = "?host=repo.mysql.com";
        String as = MyUtil.subsParameter(qs, "host");
        assertThat(as, equalTo(""));
    }
    
    @Test
    public void host() throws MalformedURLException {
        URL url = new URL("http://localhost:9008/yum/mysql-connectors-community/el/7/x86_64/repodata/95754e998234a34bd078685b9688a2ff652c0bbe-primary.sqlite.bz2?host=repo.mysql.com");
        
        
        url = MyUtil.changeURLHost(url, "www.cc.cc");
        
        assertThat(url.toString(), equalTo("http://www.cc.cc:9008/yum/mysql-connectors-community/el/7/x86_64/repodata/95754e998234a34bd078685b9688a2ff652c0bbe-primary.sqlite.bz2?host=repo.mysql.com"));
        
    }

}
