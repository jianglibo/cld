package com.mymock.webproxy.util;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

public class ByteCopyTest {
    
    @Test
    public void t() throws IOException {
        Path d = Paths.get("fixtures", "out.bin");
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        
        InputStream is = new ByteArrayInputStream("1234567890".getBytes());
        
        try {
            byte[] buf = new byte[3];
            int num = 0;
            while((num = is.read(buf)) != -1) {
                baos.write(buf, 0, num);
            }
        } catch (Exception e) {
            
        }
        
        assertThat(baos.size(), equalTo(10));
        assertThat(new String(baos.toByteArray()), equalTo("1234567890"));
        
    }

}
