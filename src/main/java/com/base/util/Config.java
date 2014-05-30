package com.base.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.core.io.support.PropertiesLoaderUtils;

public final class Config {

	private static Properties defaultConfig = null;
	
	private static Map<String, Properties>  configs = new HashMap<String, Properties>();
	
	static {
		try {
			defaultConfig = PropertiesLoaderUtils.loadAllProperties("config.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	/** 
	 * 取配置文件中的值 如果没有 就 返回""
	 * @param key
	 * @return
	 */
	public static String getValue(String key) {
		return defaultConfig.getProperty(key, "");
	}
	
	public static String getValue(String fileName, String key) {
		Properties properties = configs.get(fileName);
		if (properties == null) {
			System.out.println("dd");
			try {
				properties = PropertiesLoaderUtils.loadAllProperties(fileName+".properties");
				configs.put(fileName, properties);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return properties.getProperty(key, "");
	}
	
	public static void main(String[] args) {
		/*System.out.println(Config.getValue("fileSavePath"));
		System.out.println(Config.getValue("jdbc","driverClassName"));
		System.out.println(Config.getValue("jdbc","driverClassName"));*/
		
		Pattern p = Pattern.compile("find");
        Matcher m = p.matcher("/system/user/find");
        System.out.println(m.find());
	}
}

