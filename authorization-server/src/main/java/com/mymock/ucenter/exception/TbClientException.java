package com.mymock.ucenter.exception;

import java.util.Optional;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Sets;

public abstract class TbClientException extends Exception {

    private final static Set<String> ERROR_KEYS = Sets.newHashSet("error", "cause");

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public static final String ERROR_FIELD_NAME = "error";
    public static final String ERROR_DESCRIPTION_FIELD_NAME = "error_description";

    private String error;

    public TbClientException(String error, String message) {
        super(message);
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public static TbClientException build(JsonNode jn) {
        Optional<ErrorResult> er = ERROR_KEYS.stream().filter(k -> !jn.path(k).isMissingNode()).map(k -> new ErrorResult(jn, k)).findAny();
        if (er.isPresent()) {
            return er.get().toException();
        } else {
            return null;
        }
    }

    public static class ErrorResult {
        private String errorKey;

        private JsonNode jn;

        public ErrorResult(JsonNode jn, String errorKey) {
            this.jn = jn;
            this.errorKey = errorKey;
        }

        public TbClientException toException() {
            String errorValue;
            switch (errorKey) {
            case "error":
                errorValue = jn.path("error").asText();
                switch (errorValue) {
                case "unauthorized":
                    return new UnauthorizedTbException(errorValue, jn.path(ERROR_DESCRIPTION_FIELD_NAME).asText());
                case "invalid_token":
                    return new InvalidTokenTbException(errorValue, jn.path(ERROR_DESCRIPTION_FIELD_NAME).asText());
                case "Forbidden":
                    return new ForbiddenTbException(errorValue, jn.path("message").asText());
                default:
                    return new UndeterminedTbException(errorValue, jn.path(ERROR_DESCRIPTION_FIELD_NAME).asText());
                }
            case "cause":
                return new CauseTbException(CauseTbException.class.getName(), "cause exception.");
            default:
                return null;
            }
        }

        public String getErrorKey() {
            return errorKey;
        }

        public void setErrorKey(String errorKey) {
            this.errorKey = errorKey;
        }
    }
}
