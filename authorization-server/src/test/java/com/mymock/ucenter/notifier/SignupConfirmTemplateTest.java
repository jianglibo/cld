package com.mymock.ucenter.notifier;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.mymock.ucenter.domain.UcToken;
import com.mymock.ucenter.domain.UcToken.UcTokenFor;
import com.mymock.ucenter.notifier.EmailVerifyTemplate;
import com.mymock.ucenter.notifier.PasswordRecoverTemplate;
import com.mymock.ucenter.notifier.SendCloudService;
import com.mymock.ucenter.notifier.SendCloudTemplate;
import com.mymock.ucenter.notifier.SignupConfirmTemplate;
import com.mymock.ucenter.notifier.TaskFeedbackTemplate;
import com.mymock.ucenter.utils.IgnoreMissingFieldObjectMapperUc;
import com.mymock.ucenter.utils.PersonVoBuilder;
import com.mymock.ucenter.vo.PersonVo;

public class SignupConfirmTemplateTest {

    private PersonVo pvo = new PersonVoBuilder().name("aa").password("pwd").build();

    @Test
    public void testSendConfirm() throws ClientProtocolException, IOException {

        SendCloudTemplate sct = new SignupConfirmTemplate(pvo, "http://host.com", getUctoken(UcTokenFor.VERIFY_EMAIL)).withTos("391772322@qq.com");
        List<NameValuePair> nps = sct.createPostForm().build();

        Optional<NameValuePair> np = nps.stream().filter(pn -> pn.getName().equals("substitution_vars")).findFirst();

        assertThat(np.isPresent(), is(true));

        boolean sr = new SendCloudService().setOm(IgnoreMissingFieldObjectMapperUc.get()).sendEmail(sct);

        assertThat(sr, is(true));

    }

    @Test
    public void testPasswordRecover() throws ClientProtocolException, IOException {

        SendCloudTemplate evt = new PasswordRecoverTemplate(//
                getUctoken(UcTokenFor.PASSWORD_RECOVER), "http://sbc.cc.cc", "/thtpl?tpl=retrievePassword")//
                        .withTos("391772322@qq.com");
        List<NameValuePair> nps = evt.createPostForm().build();

        Optional<NameValuePair> np = nps.stream().filter(pn -> pn.getName().equals("substitution_vars")).findFirst();

        assertThat(np.isPresent(), is(true));

        boolean sr = new SendCloudService().setOm(IgnoreMissingFieldObjectMapperUc.get()).sendEmail(evt);
        assertThat(sr, is(true));

    }

    @Test
    public void testEmailVerify() throws ClientProtocolException, IOException {

        SendCloudTemplate evt = new EmailVerifyTemplate(getUctoken(UcTokenFor.VERIFY_EMAIL), "http://sbc.cc.cc", "").withTos("391772322@qq.com");
        List<NameValuePair> nps = evt.createPostForm().build();

        Optional<NameValuePair> np = nps.stream().filter(pn -> pn.getName().equals("substitution_vars")).findFirst();

        assertThat(np.isPresent(), is(true));

        boolean sr = new SendCloudService().setOm(IgnoreMissingFieldObjectMapperUc.get()).sendEmail(evt);
        assertThat(sr, is(true));

    }

    @Test
    public void testSendTaskFeed() throws ClientProtocolException, IOException {

        SendCloudTemplate sct = new TaskFeedbackTemplate("http://www.google.com").withTos("391772322@qq.com");
        List<NameValuePair> nps = sct.createPostForm().build();

        Optional<NameValuePair> np = nps.stream().filter(pn -> pn.getName().equals("substitution_vars")).findFirst();

        assertThat(np.isPresent(), is(true));

        boolean sr = new SendCloudService().setOm(IgnoreMissingFieldObjectMapperUc.get()).sendEmail(sct);
        assertThat(sr, is(true));

    }

    private UcToken getUctoken(UcTokenFor tkf) {
        UcToken uctk = new UcToken(tkf, ChronoUnit.DAYS, 1);
        uctk.beforePersist();
        return uctk;
    }
}
