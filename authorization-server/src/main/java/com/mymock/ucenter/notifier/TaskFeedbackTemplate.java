package com.mymock.ucenter.notifier;

import com.google.common.collect.Sets;

public class TaskFeedbackTemplate extends SendCloudTemplate {
    
    public static String APPNAME = "appname";

    public TaskFeedbackTemplate(String appname) {
        super("task_feedback", Sets.newHashSet(APPNAME));
        setSubjectTpl("[网蛙科技]任务完成通知");
        withVar(APPNAME, appname);
    }

    @Override
    protected String getSubject() {
        return getSubjectTpl();
    }
}
