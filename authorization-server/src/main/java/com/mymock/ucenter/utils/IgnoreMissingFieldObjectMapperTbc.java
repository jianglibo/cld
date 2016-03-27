
package com.mymock.ucenter.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class IgnoreMissingFieldObjectMapperTbc {
    
    private static enum Singleton {
        ONE_OM;
        private final ObjectMapper om;

        private Singleton() {
            om = new ObjectMapper();
            om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        }

        public ObjectMapper get() {
            return om;
        }

    }
    
    public static ObjectMapper get() {
        return Singleton.ONE_OM.get();
    }
}
