
package com.mymock.ucenter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;


/**
 * @author jianglibo@gmail.com
 *         2015年10月12日
 *
 */
public class JsonAssertUtil {

    private ObjectMapper objectMapper;

    private JsonUtil jsonUtil;

    public JsonAssertUtil(ObjectMapper objectMapper, JsonUtil jsonUtil) {
        this.objectMapper = objectMapper;
        this.jsonUtil = jsonUtil;
    }


    private boolean keyExists(JsonNode jn, String... keys) {
        for (String key : keys) {
            jn = jn.path(key);
            if (jn.isMissingNode()) {
                return false;
            }
        }
        return true;
    }

    /**
     * 
     * @param jn
     * @param keys
     * @throws IOException
     */
    public void hasKey(JsonNode jn, String... keys) throws IOException {
        assertThat(String.join(".", keys) + " should be exists.", keyExists(jn, keys), is(true));
    }

    public void hasKey(String c, String... keys) throws IOException {
        hasKey(objectMapper.readTree(c), keys);
    }
    
    
    public void hasAllKeys(JsonNode jn, String...keys) throws IOException {
        for(String k: keys) {
            hasKey(jn, k);
        }
    }
    
    public void hasAllKeys(String c, String...keys) throws IOException{
        hasAllKeys(objectMapper.readTree(c), keys);
    }


    /**
     * noKey的话，中间的都可以存在，在最后一个不能存在。
     * 
     * @param jn
     * @param keys
     * @throws IOException
     */
    public void noKey(JsonNode jn, String... keys) throws IOException {
        assertThat(String.join(".", keys) + " should not exists.", keyExists(jn, keys), is(false));
    }

    public void noKey(String c, String... keys) throws IOException {
        noKey(objectMapper.readTree(c), keys);
    }
    
    public void noAllKeys(JsonNode jn, String... keys) throws IOException {
        for(String k: keys) {
            noKey(jn, k);
        }
    }

    public void noAllKeys(String c, String... keys) throws IOException {
        noAllKeys(objectMapper.readTree(c), keys);
    }

    public void isValueType(JsonNode jn, JsonNodeType jnt, String... keys) throws IOException {
        hasKey(jn, keys);
        assertThat(String.join(".", keys) + " should be " + jnt.toString(), jsonUtil.getNode(jn, keys).getNodeType(), is(jnt));
    }

    public void isValueType(String c, JsonNodeType jnt, String... keys) throws IOException {
        isValueType(objectMapper.readTree(c), jnt, keys);
    }

    public void isObjectValue(JsonNode jn, String... keys) throws IOException {
        isValueType(jn, JsonNodeType.OBJECT, keys);
    }

    public void isObjectValue(String c, String... keys) throws IOException {
        isValueType(c, JsonNodeType.OBJECT, keys);
    }

    public void isArrayValue(JsonNode jn, String... keys) throws IOException {
        isValueType(jn, JsonNodeType.ARRAY, keys);
    }

    public void isNumberValue(JsonNode jn, String... keys) throws IOException {
        isValueType(jn, JsonNodeType.NUMBER, keys);
    }

    public void isNullValue(JsonNode jn, String... keys) throws IOException {
        isValueType(jn, JsonNodeType.NULL, keys);
    }

    public void isBooleanValue(JsonNode jn, String... keys) throws IOException {
        isValueType(jn, JsonNodeType.BOOLEAN, keys);
    }

    public void isTrueValue(JsonNode jn, String... keys) throws IOException {
        isBooleanValue(jn, keys);
        JsonNode jn1 = jsonUtil.getNode(jn, keys);
        assertThat(String.join(".", keys) + " should be true", jn1.asBoolean(), is(true));
    }

    public void isFalseValue(JsonNode jn, String... keys) throws IOException {
        isBooleanValue(jn, keys);
        JsonNode jn1 = jsonUtil.getNode(jn, keys);
        assertThat(String.join(".", keys) + " should be false", jn1.asBoolean(), is(false));
    }

    public void isArrayValue(String c, String... keys) throws IOException {
        isValueType(c, JsonNodeType.ARRAY, keys);
    }

    public void isNumberValue(String c, String... keys) throws IOException {
        isValueType(c, JsonNodeType.NUMBER, keys);
    }

    public void isNullValue(String c, String... keys) throws IOException {
        isValueType(c, JsonNodeType.NULL, keys);
    }

    public void isBooleanValue(String c, String... keys) throws IOException {
        isValueType(c, JsonNodeType.BOOLEAN, keys);
    }

    public void isTrueValue(String c, String... keys) throws IOException {
        isBooleanValue(c, keys);
        JsonNode jn = jsonUtil.getNode(c, keys);
        assertThat(String.join(".", keys) + " should be true", jn.asBoolean(), is(true));
    }

    public void isFalseValue(String c, String... keys) throws IOException {
        isBooleanValue(c, keys);
        JsonNode jn = jsonUtil.getNode(c, keys);
        assertThat(String.join(".", keys) + " should be false", jn.asBoolean(), is(false));
    }

    public void linkNumber(String c, int num) throws JsonProcessingException, IOException {
        linkNumber(getObjectMapper().readTree(c), num);
    }

    public void linkNumber(JsonNode jn, int num) throws JsonProcessingException, IOException {
        assertThat("link number should be: " + num, jsonUtil.extractLinks(jn).size(), is(num));
    }

    public void hasLinks(JsonNode jn, String... linkNames) throws JsonProcessingException, IOException {
        for (String linkName : linkNames) {
            assertThat("should has linkName: " + linkName, jsonUtil.extractLinks(jn), org.hamcrest.Matchers.hasKey(linkName));
        }
    }

    public void hasLinks(String c, String... linkNames) throws JsonProcessingException, IOException {
        hasLinks(getObjectMapper().readTree(c), linkNames);
    }

    public void linkHrefMatch(String c, String linkName, String regex) throws JsonProcessingException, IOException {
        TeLink tl = jsonUtil.extractLinks(c).get(linkName);
        String href = tl.getHref();
        assertThat(href.matches(regex), is(true));
    }
    
    public void linkHasTemplate(String c, String linkName) throws JsonProcessingException, IOException {
        TeLink tl = jsonUtil.extractLinks(c).get(linkName);
        assertThat("link: " + linkName + ", hasTemplate must templated. ", tl.isTemplated(), is(true));
    }
    
    public void linkHasNoTemplate(String c, String linkName) throws JsonProcessingException, IOException {
        TeLink tl = jsonUtil.extractLinks(c).get(linkName);
        assertThat("link: " + linkName + ", hasTemplate must not templated ", tl.isTemplated(), is(false));
    }

    public void embeddedNum(String c, String pluralRn, int num) throws JsonProcessingException, IOException {
        ArrayNode an = jsonUtil.getEmbeddedList(c, pluralRn);
        assertThat("embedded item number must be: " + num, an.size(), is(num));
    }

    public void noEmbeddedKey(String c) throws JsonProcessingException, IOException {
        JsonNode jn = getObjectMapper().readTree(c);
        noEmbeddedKey(jn);
    }

    public void noEmbeddedKey(JsonNode jn) {
        assertThat("no _embedded key.", jn.path(JsonUtil.EMBEDDED_KEY).isMissingNode(), is(true));
    }
    
    public void arrayLengthIs(JsonNode jn, int len, String...keys) throws IOException {
        ArrayNode an = jsonUtil.getArrayNode(jn, keys);
        assertThat("node is array, and length should be " + len, an.size(), is(len));
    }
    
    public void arrayLengthIs(String c, int len, String...keys) throws IOException {
        arrayLengthIs(getObjectMapper().readTree(c), len, keys);
    }
    
    public void isEmptyArray(JsonNode jn, String...keys) throws IOException{
        arrayLengthIs(jn, 0, keys);
    }
    
    public void isEmptyArray(String c, String...keys) throws IOException{
        arrayLengthIs(c, 0, keys);
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
