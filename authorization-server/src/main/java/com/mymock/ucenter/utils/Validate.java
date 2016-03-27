package com.mymock.ucenter.utils;

import java.util.regex.Pattern;

/**
 * 验证邮箱和用户名的合法性
 * 用户名:中英文，数字，下划线
 * 用户名长度:中文最多7个，英文6~18个
 * */

public class Validate {
	
	public static Boolean validateUsername(String username) {
		int len = username.length();
		Pattern pattern = Pattern.compile("^([\u4E00-\uFA29]|[\uE7C7-\uE7F3])+$");//汉字
		Pattern pattern1 = Pattern.compile("[a-z]|[A-Z]|[0-9]|_|[\u4E00-\uFA29]|[\uE7C7-\uE7F3]");//合法字符
		for(int i = 0; i< username.length(); i++ ){
			if(pattern.matcher(username.subSequence(i, i+1)).find()){//一个汉字=2个字符长度
				len +=1;
			}
			if(!pattern1.matcher(username.subSequence(i, i+1)).find()){
				return false;
			}
		}
		if(len > 18 || len < 6){
			return false;			
		}
		return true;
	}

	public static Boolean validateEmail(String email) {
		Pattern regexEmail = Pattern.compile("^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
		if (regexEmail.matcher(email).matches()){
			return true;
		}else
			return false;
	}
	
	public static Boolean validateMobile(String mobile){
		Pattern regexMobile = Pattern.compile("^(((13[0-9])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{7})$");
		if(regexMobile.matcher(mobile).matches()){
			return true;
		}else{
			return false;
		}
	}
	
}
