package com.base.util;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;

public final class Config {

	private static Properties config = null;
	
	static {
		try {
			config = PropertiesLoaderUtils.loadAllProperties("config.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String VERIFYCODE = "verifyCode"; //验证码放在session的key
	
	public static String USER = "user"; //user放在session的key
	  
	public static String USER_NAME_DOES_NOT_EXIST = "用户名不存在!";
	
	public static String PASSWORD_WRONG  = "您输入的密码和账户名不匹配，请重新输入!";

	public static String INVALID_REQUEST = "invalid request";
	
	public static String SUCCESS = "操作成功!";
	
	public static String FAILURE = "操作失败!";
	/** 
	 * 取配置文件中的值 如果没有 就 返回""
	 * @param key
	 * @return
	 */
	public static String getValue(String key) {
		return config.getProperty(key, "");
	}
	
	public static void main(String[] args) {
		System.out.println(Config.getValue("fileSavePath"));
	}
}

