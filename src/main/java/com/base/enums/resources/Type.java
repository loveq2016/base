package com.base.enums.resources;

import java.util.*;

import com.base.util.BaseEnum;

public enum Type implements BaseEnum {

	Module(10, "模块"),
	Method(20, "方法")
	;
	
	private Type(Integer key, String text) {
		this.code = key;
		this.text = text;
	}
	
	private Integer code;
	
	private String text;
	
	private static Map<Integer, String> map = new TreeMap<Integer, String>();
	
	public static Map<Integer, String> getMap() {
		if (map.isEmpty()) {
			for (Type e :values()) {
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
		return "resourcesType";
	}
	 
	public static boolean isExist(Object code) {
		return map.containsKey(code);
	}
}
