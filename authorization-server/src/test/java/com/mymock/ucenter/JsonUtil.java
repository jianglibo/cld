package com.mymock.ucenter;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonUtil {
    
    public static final String EMBEDDED_KEY = "_embedded";
    
    private static final String LINKS_KEY = "_links";
    
    private ObjectMapper objectMapper;
    
    private String normalizeKey(String key) {
        if (key.startsWith("/")) {
            return key.substring(1);
        } else {
            return key;
        }
    }
    
    public JsonUtil(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
    
    public JsonNode getNode(String c, String...keys) throws IOException {
        return getNode(objectMapper.readTree(c), keys);
    }
    
    public JsonNode getNode(JsonNode jn, String...keys) throws IOException {
        for(String key: keys) {
            jn = jn.path(normalizeKey(key));
        }
        return jn;
    }
    
    public ObjectNode getObjectNode(JsonNode jn, String...keys) throws IOException {
        return (ObjectNode) getNode(jn, keys);
    }
    
    public ObjectNode getObjectNode(String c, String...keys) throws IOException {
        return (ObjectNode) getNode(c, keys);
    }
    
    public ArrayNode getArrayNode(JsonNode jn, String...keys)  throws IOException {
        return (ArrayNode) getNode(jn, keys);
    }
    
    public ArrayNode getArrayNode(String c, String...keys)  throws IOException {
        return (ArrayNode) getNode(c, keys);
    }
    
    public Map<String, TeLink> extractLinks(String c) throws JsonProcessingException, IOException {
        JsonNode jn = getObjectMapper().readTree(c);
        return extractLinks(jn);
    }

    public Map<String, TeLink> extractLinks(JsonNode jn) throws JsonProcessingException, IOException {
        JsonNode lnks = jn.get(LINKS_KEY);
        return getObjectMapper().convertValue(lnks, getObjectMapper().getTypeFactory().constructMapType(Map.class, String.class, TeLink.class));
    }
    
    public TeLink getTeLink(String c, String ln) throws JsonProcessingException, IOException {
        return getTeLink(getObjectMapper().readTree(c), ln);
    }
    
    public TeLink getTeLink(JsonNode jn, String ln) throws JsonProcessingException, IOException {
        return extractLinks(jn).get(ln);
    }
    
    public ObjectNode getEmbeddedAt(String c, String pluralRn, int idx) throws JsonProcessingException, IOException {
        JsonNode jn = getObjectMapper().readTree(c);
        return (ObjectNode) jn.get(EMBEDDED_KEY).get(normalizeKey(pluralRn)).get(idx);
    }
    
    public ObjectNode getEmbeddedFirst(String c, String pluralRn)  throws JsonProcessingException, IOException {
        return getEmbeddedAt(c, pluralRn, 0);
    }
    
    public String getJsonStringValue(String c, String key) throws JsonProcessingException, IOException {
        return getObjectMapper().readTree(c).get(normalizeKey(key)).asText();
    }

    public ArrayNode getEmbeddedList(String c, String pluralRn) throws JsonProcessingException, IOException {
        JsonNode embJn = getObjectMapper().readTree(c).path(EMBEDDED_KEY);
        if (embJn.isMissingNode()) {
            return getObjectMapper().createArrayNode();
        } else {
            JsonNode pnode = embJn.path(normalizeKey(pluralRn));
            if (pnode.isMissingNode()) {
                return getObjectMapper().createArrayNode();
            } else {
                return (ArrayNode) pnode; 
            }
        }
    }
    
    private ObjectMapper getObjectMapper() {
        return objectMapper;
    }

}
