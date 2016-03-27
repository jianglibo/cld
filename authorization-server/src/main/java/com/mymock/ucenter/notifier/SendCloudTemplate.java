package com.mymock.ucenter.notifier;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.client.fluent.Form;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public abstract class SendCloudTemplate {

    private static ObjectMapper om = new ObjectMapper();

    private final String apiUser = "wwservice";

    private final String apiKey = "MsvcIGDX3pGpanrV";

    private final String from = "service@openscanner.cc";

    private final String fromname = "网蛙科技";

    private final String tplName;

    private final Set<String> substituteNames;

    private String subjectTpl;

    private SubstitutionVars stvs = new SubstitutionVars();
    

    public SendCloudTemplate(String tplName, Set<String> substituteNames) {
        this.tplName = tplName;
        this.substituteNames = substituteNames;
    }

    public Form createPostForm() throws JsonProcessingException {
        // @formatter:off
        return Form.form()
                .add("template_invoke_name", getTplName())
                .add("api_key", getApiKey())
                .add("api_user", getApiUser())
                .add("from", getFrom())
                .add("fromname", getFromname())
                .add("subject", getSubject())
                .add("substitution_vars",om.writeValueAsString(stvs));
        // @formatter:on
    }

    protected abstract String getSubject();

    public SendCloudTemplate withTos(String... tos) {
        this.stvs.setTo(tos);
        return this;
    }

    public SendCloudTemplate withVar(String key, String val) {
        String kk = key;
        if (!kk.startsWith("%")) {
            kk = "%" + key + "%";
        }
        if (stvs.getSub().get(kk) == null) {
            stvs.getSub().put(kk, Lists.newArrayList());
        }
        stvs.getSub().get(kk).add(val);
        return this;
    }

    public String getTplName() {
        return tplName;
    }

    public Set<String> getSubstituteNames() {
        return substituteNames;
    }

    public String getSubjectTpl() {
        return subjectTpl;
    }

    public void setSubjectTpl(String subjectTpl) {
        this.subjectTpl = subjectTpl;
    }

    public SubstitutionVars getStvs() {
        return stvs;
    }

    public void setStvs(SubstitutionVars stvs) {
        this.stvs = stvs;
    }

    public String getApiUser() {
        return apiUser;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getFrom() {
        return from;
    }

    public String getFromname() {
        return fromname;
    }

    public static class SubstitutionVars {

        private String[] to;

        private Map<String, List<String>> sub = Maps.newHashMap();

        public Map<String, List<String>> getSub() {
            return sub;
        }

        public void setSub(Map<String, List<String>> sub) {
            this.sub = sub;
        }

        public String[] getTo() {
            return to;
        }

        public void setTo(String[] to) {
            this.to = to;
        }
    }
}
