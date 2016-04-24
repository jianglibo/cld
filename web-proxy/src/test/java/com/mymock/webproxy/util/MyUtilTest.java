package com.mymock.webproxy.util;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        assertFalse(MyUtil.isFileLike("http://www.abc.cc/a"));
        assertFalse(MyUtil.isFileLike("http://www.abc.cc/a.txt?k=v"));
        assertFalse(MyUtil.isFileLike("http://www.abc.cc/a.txt?"));
    }
    
    @Test
    public void extractFileName() {
        assertThat(MyUtil.extractFileName("http://ww.abc.cc/a.txt"), equalTo("a.txt"));
        assertThat(MyUtil.extractFileName("http://ww.abc.cc/a"), nullValue());
        assertThat(MyUtil.extractFileName("http://ww.abc.cc/a.txt?k=v"), nullValue());
        assertThat(MyUtil.extractFileName("http://ww.abc.cc/a.txt?"), nullValue());
    }

}
