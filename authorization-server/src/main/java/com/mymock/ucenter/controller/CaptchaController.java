package com.mymock.ucenter.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.bingoohuang.patchca.custom.ConfigurableCaptchaService;
import com.github.bingoohuang.patchca.utils.encoder.EncoderHelper;
import com.mymock.ucenter.controller.LoginController.LoginResultMessage;
import com.mymock.ucenter.vo.LoginResult;

//import com.octo.captcha.service.image.ImageCaptchaService;

@Controller
public class CaptchaController {
	
	public static final String CHALLANGE_SESSION_KEY = "__CHALLANGE_SESSION_KEY";
	
	@Autowired
	private ConfigurableCaptchaService captchaService;

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public LoginResult handleIOException(Exception ex) {
		if (ex instanceof HttpMessageNotReadableException) {
			return new LoginResult(LoginResultMessage.WRONG_JSON_MESSAGE);
		} else {
			return new LoginResult(LoginResultMessage.USERNAME_PASSWORD_NOT_MATCH);
		}
	}

	@RequestMapping(value = "/login/captcha", method = RequestMethod.GET)
	public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// flush it in the response
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg");
		ServletOutputStream responseOutputStream = response.getOutputStream();
		String challange = EncoderHelper.getChallangeAndWriteImage(captchaService, "PNG", responseOutputStream);
		
		HttpSession session = request.getSession(false);

		if (session != null) {
			session.setAttribute(CHALLANGE_SESSION_KEY, challange);
		}
		responseOutputStream.flush();
		responseOutputStream.close();
	}

}
