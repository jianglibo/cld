package com.mymock.ucenter.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * 
 * https://github.com/yahoo/xss-filters/wiki#inhtmldatas--string
 * 
 * @author jianglibo@gmail.com
 *
 *         2015年8月16日-下午1:33:56
 */
public class YahooXssFilter {

    public String filterServiceUrl = "http://localhost:3333";
    
    public static String HTMLData = "HTMLData";
    public static String HTMLComment = "HTMLComment";
    public static String SingleQuotedAttr = "SingleQuotedAttr";
    public static String DoubleQuotedAttr = "DoubleQuotedAttr";
    public static String UnQuotedAttr = "UnQuotedAttr";

    public List<ItemToFilter> xssFilter(List<ItemToFilter> items) {
        try {
            String jsonStr = IgnoreMissingFieldObjectMapperTbc.get().writeValueAsString(items);
            String responseContent = Request.Post(filterServiceUrl).bodyString(jsonStr, ContentType.APPLICATION_JSON).execute().returnContent()
                    .asString(StandardCharsets.UTF_8);
            return IgnoreMissingFieldObjectMapperTbc.get().readValue(responseContent, new TypeReference<List<YahooXssFilter.ItemToFilter>>() {
            });
        } catch (IOException e) {
            return items;
        }
    }

    private static enum Singleton {
        ONE_OM;
        private final YahooXssFilter yxf;

        private Singleton() {
            yxf = new YahooXssFilter();
        }

        public YahooXssFilter get() {
            return yxf;
        }
    }

    public static YahooXssFilter get() {
        return Singleton.ONE_OM.get();
    }

    public static class ItemToFilter {
        private String inputType;
        private String whereToPut;
        private String fname;
        private boolean filtered;
        private String content;
        
        public ItemToFilter() {}

        public ItemToFilter(String fname, String content, String whereToPut) {
            this(fname, content, whereToPut, null);
        }

        public ItemToFilter(String fname, String content, String whereToPut, String inputType) {
            super();
            this.setInputType(inputType);
            this.setContent(content);
            this.whereToPut = whereToPut;
            this.fname = fname;
        }

        public String getWhereToPut() {
            return whereToPut;
        }

        public void setWhereToPut(String whereToPut) {
            this.whereToPut = whereToPut;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public boolean isFiltered() {
            return filtered;
        }

        public void setFiltered(boolean filtered) {
            this.filtered = filtered;
        }

        public String getInputType() {
            return inputType;
        }

        public void setInputType(String inputType) {
            this.inputType = inputType;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
