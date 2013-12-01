package com.base.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;

public final class Config {

	private static Map<String, Properties> configs = new HashMap<String, Properties>();
	
	private static Properties defaultProperties;
	
	static {
		try {
			defaultProperties = PropertiesLoaderUtils.loadAllProperties("config.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String VERIFYCODE = "verifyCode"; //验证码放在session的key
	
	public static String USER = "user"; //user放在session的key
	  
	public static String USER_NAME_DOES_NOT_EXIST = "用户名不存在!";
	
	public static String PASSWORD_WRONG  = "您输入的密码和账户名不匹配，请重新输入!";
	
	public static Integer YES = 1;  //适合在单选按钮的适合， 是与否
	public static Integer NO = 0;    //适合在单选按钮的适合， 是与否
	
	public static Integer TOP_DATA = -1; //所有顶数据标识【0】，适合树形机构的表

	public static String INVALID_REQUEST = "invalid request";
	
	public static String SUCCESS = "操作成功!";
	
	public static String FAILURE = "操作失败!";
	
	/** 
	 * 取配置文件中的值 如果没有 就 返回""
	 * @param key 
	 * @return
	 */
	public static String getValue(String key) {
		return defaultProperties.getProperty(key, "");
	}
	
	
	public static String getValue(String propertieName, String key) {
		Properties properties = configs.get(propertieName);
		if (properties != null) {
			return properties.getProperty(key, "");
		} else {
			Properties config;
			try {
				config = PropertiesLoaderUtils.loadAllProperties(propertieName+".properties");
				configs.put(propertieName, config);
				return config.getProperty(key, "");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "";
		}
	}
	public static void main(String[] args) {
		System.out.println(Config.getValue("jdbc","initialSize"));
	}
}

