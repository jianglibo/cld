package com.mymock.webproxy.logic.cachedprocessor;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

@Component
public class CachedProcessors implements Iterable<CachedProcessor> {

    private final List<CachedProcessor> processors = Lists.newArrayList();

    /**
     * processor order matters.
     * @param ml
     * @param ditr
     * @param dbtr
     */
    @Autowired
    public CachedProcessors(MirrorListHandler ml, DiskToResp ditr, DbToResp dbtr) {
        processors.add(ml);
        processors.add(ditr);
        processors.add(dbtr);
    }

    public List<CachedProcessor> getProcessors() {
        return processors;
    }

    @Override
    public Iterator<CachedProcessor> iterator() {
        return processors.iterator();
    }
}
