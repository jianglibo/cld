/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic.resourcegetter;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.logic.bytesprocessor.BytesProcessor;

/**
 * give a url, I will get the resource, and give it to StreamHolder.
 * 
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */

public class DiskFileGetter extends ResourceGetter {

    public DiskFileGetter(ResourceLocation rl, BytesProcessor... consumers) {
        super(rl, consumers);
    }

    public String play() throws ResourceGetterException, IOException, URISyntaxException {
        distributeStream(Files.newInputStream(Paths.get(getRl().getUrl().toURI())));
        return RG_OK;
    }
}
