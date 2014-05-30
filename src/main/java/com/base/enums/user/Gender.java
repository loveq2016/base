package com.base.enums.user;

import java.util.Map;
import java.util.TreeMap;

import com.base.util.BaseEnum;

public enum Gender implements BaseEnum {

	male(10, "男"),
	female(20, "女")
	;
	
	private Gender(Integer key, String text) {
		this.code = key;
		this.text = text;
	}
	
	private Integer code;
	
	private String text;
	
	private static Map<Integer, String> map = new TreeMap<Integer, String>();
	
	public static Map<Integer, String> getMap() {
		if (map.isEmpty()) {
			for (Gender e :values()) {
				map.put(e.code, e.text);
			}
		}
		return map;
	}
	
	public static String getText(Integer code) {
		if (map.isEmpty()) {
			getMap();
		}
		String text = map.get(code);
		if (text == null) {
			return "";
		} else {
			return text;
		}
	}
	
	@Override
	public String getKey() {
		return "userGender";
	}
	 
	public static boolean isExist(Integer code) {
		if (map.isEmpty()) {
			getMap();
		}
		return map.containsKey(code);
	}
	 
}
