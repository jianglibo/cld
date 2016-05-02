package com.mymock.webproxy.logic.cachedprocessor;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletResponse;

import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.ResourceLocation;

public interface CachedProcessor {
    
    public boolean start(HttpServletResponse resp, ResourceLocation rl, ReentrantLock urlLock)
            throws IOException, ResourceGetterException, URISyntaxException, BytesProcessorException;

}
