package com.mymock.ucenter.controller;

import java.io.IOException;
import java.time.Instant;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mymock.ucenter.config.userdetail.PersonManager;
import com.mymock.ucenter.domain.Person;
import com.mymock.ucenter.domain.UcToken;
import com.mymock.ucenter.repository.PersonRepository;
import com.mymock.ucenter.repository.UcTokenRepository;
import com.mymock.ucenter.utils.PasswordPolicy;
import com.mymock.ucenter.utils.PasswordPolicy.PasswordViolationMessage;

/**
 * 这个类功能的设计有点绕。对于uctoken的消费没有限定用那个模板来显示，而是通过rd参数来指定用那个模板，改模板可以通过uctk参数来获取。
 * 
 * @author jianglibo@gmail.com
 *
 */

@Controller
public class TkConsumerController {

    public static final String UCTOKEN_SESSION_KEY = "__UCTOKEN_SESSION_KEY";

    public static enum ConsumeResultEnum {
        SUCCESS, EXPIRED, USED, MISSING, UNEXPECTED, JSON_READ_ERROR
    }
    
    @Autowired
    private UcTokenRepository uctokenRepo;
    
    @Autowired
    @Qualifier("ignoreMissingFieldOm")
    private ObjectMapper ignoreMissingFieldOm;

    @Autowired
    private PersonRepository personRepo;

    @Autowired
    private PersonManager personManager;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ConsumeResult handleIOException(Exception ex) {
        if (ex instanceof HttpMessageNotReadableException) {
            return new ConsumeResult(ConsumeResultEnum.JSON_READ_ERROR, null);
        } else {
            return new ConsumeResult(ConsumeResultEnum.UNEXPECTED, null);
        }
    }

    // ${param.foo} // Retrieves a String[] with the values of request parameter 'foo'
    // ${param.size()}
    // ${param.isEmpty()}
    // ${param.containsKey('foo')}
    // ${session.foo} // Retrieves the session atttribute 'foo'
    // ${session.size()}
    // ${session.isEmpty()}
    // ${session.containsKey('foo')}
    /**
     * 这个断点必定携带一个rd参数，也就是需要使用uctk的页面的路径。
     * @param uctk
     * @param rd
     * @param request
     * @param response
     * @return
     * @throws IOException
     */

    @RequestMapping(value = "/tkconsumer", method = RequestMethod.GET)
    public String perConsume(@RequestParam("uctk") String uctk, @RequestParam("rd") String rd, HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        request.getSession(true).setAttribute(UCTOKEN_SESSION_KEY, uctk);
        return "redirect:" + rd;
    }

    @RequestMapping(value = "/tkconsumer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ConsumeResult consume(@RequestBody Map<String, String> map, HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        String uctk = map.get("uctk"); 

        UcToken utk = uctokenRepo.findByTk(uctk);

        if (utk != null) {
            if (utk.getUseTimes() > 0) {
                return new ConsumeResult(ConsumeResultEnum.USED, utk.getExtra());
            } else if (utk.getCreatedAt().toInstant().plusMillis(utk.getMillis()).isBefore(Instant.now())) {
                return new ConsumeResult(ConsumeResultEnum.EXPIRED, utk.getExtra());
            }
        } else {
            return new ConsumeResult(ConsumeResultEnum.MISSING, null);
        }

        return startConsume(utk, map);

    }

    private ConsumeResult startConsume(UcToken utk, Map<String,String> map) throws JsonParseException, JsonMappingException, IOException {
        switch (utk.getTkf()) {
        case PASSWORD_RECOVER:
            return recoverPassword(utk, map);
        case VERIFY_EMAIL:
            return verifyEmail(utk, map);
        default:
            break;
        }
        return null;
    }

    private ConsumeResult verifyEmail(UcToken utk, Map<String,String> map) throws JsonParseException, JsonMappingException, IOException {
        String email = utk.getExtra();
        Person person = personRepo.findByEmail(email);
        if (person == null) {
            return new ConsumeResult(ConsumeResultEnum.MISSING, email);
        }
        
        person.setEmailVerified(true);
        personRepo.save(person);
        return new ConsumeResult(ConsumeResultEnum.SUCCESS, email);
    }

    /**
     * 要恢复密码，说明他已经登陆不了了，那么提供的token里面需要哪些资料呢？是的他会提供email，如果没有提供正确的email，那么显然无法重置密码了。
     * 接受的对象是： {uctk: "skskk228383", newpwd: "mynewpass"}
     * 
     * @param utk
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     */
    private ConsumeResult recoverPassword(UcToken utk, Map<String,String> map) throws JsonParseException, JsonMappingException, IOException {
        String email = utk.getExtra();
        Person person = personRepo.findByEmail(email);
        if (person == null) {
            return new ConsumeResult(ConsumeResultEnum.MISSING, email);
        }
        PasswordViolationMessage pvm = PasswordPolicy.validatePassword(map.get("newpwd")); 
        if (pvm == PasswordViolationMessage.YES) {
            person.setPassword(passwordEncoder.encode(map.get("newpwd")));
            personRepo.save(person);
            return new ConsumeResult(ConsumeResultEnum.SUCCESS, email);
        } else {
            return new ConsumeResult(pvm, email);
        }
    }

    public static class ConsumeResult {

        private String message;
        
        private String email;

        public ConsumeResult(ConsumeResultEnum  message, String email) {
            this.message = message.toString();
            this.email = email;
        }
        
        public ConsumeResult(PasswordViolationMessage  message, String email) {
            this.message = message.toString();
            this.email = email;
        }


        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

}
