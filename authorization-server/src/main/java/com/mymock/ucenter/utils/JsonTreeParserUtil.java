package com.mymock.ucenter.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.mymock.ucenter.exception.UnparsableJsonException;

public class JsonTreeParserUtil {

    public static JsonNode parseTree(String rawData) throws UnparsableJsonException {
        try {
           return IgnoreMissingFieldObjectMapperTbc.get().readTree(rawData);
        } catch (JsonProcessingException e) {
            throw new UnparsableJsonException(JsonProcessingException.class.getName(), e.getMessage());
        } catch (IOException e) {
            throw new UnparsableJsonException(IOException.class.getName(), e.getMessage());
        }
    }
}

