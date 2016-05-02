/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.diskFile;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.HitStatus;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.logic.bytesprocessor.ToDiskWithPath;
import com.mymock.webproxy.logic.resourcegetter.DiskFileGetter;
import com.mymock.webproxy.logic.resourcegetter.ResourceGetter;

/**
 * @author jianglibo@gmail.com
 *         2016年4月25日
 *
 */
public class WriteAndRead {

    private static Path fixture = Paths.get("fixturesout");

    private Path fp;

    static {
        try {
            Files.createDirectories(fixture);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void bf() throws IOException {
        fp = fixture.resolve("ttt.bin");
        if (Files.exists(fp)) {
            Files.delete(fp);
        }
        OutputStream os = Files.newOutputStream(fp);
        for (int i = 0; i < 10000; i++) {
            os.write(new Double(Math.random()).toString().getBytes());
        }
        os.flush();
        os.close();
    }

    @Test
    public void t() throws ResourceGetterException, IOException, URISyntaxException {
        ResourceLocation rl = new ResourceLocation(fp);
        Path dstFile = fixture.resolve("dst.bin");
        ResourceGetter rg = new DiskFileGetter(rl, new HitStatus(), new ToDiskWithPath(dstFile));
        rg.play();
        assertThat(Files.size(dstFile) - Files.size(fp), equalTo(0L));
        Files.delete(fp);
    }

}
