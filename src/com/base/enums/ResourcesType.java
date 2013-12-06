package com.base.enums;

import java.util.*;

public enum ResourcesType {

	Module(1, "模块"),
	Method(2, "方法")
	;
	
	ResourcesType(Integer key, String value) {
		this.key = key;
		this.value = value;
	}
	
	private Integer key;
	
	private String value;
	
	private static Map<Integer, String> map = new TreeMap<Integer, String>();

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public static Map<Integer, String> getMap() {
		if (map.isEmpty()) {
			for (ResourcesType resourcesType :values()) {
				map.put(resourcesType.key, resourcesType.value);
			}
		}
		return map;
	}
	
	public static String getText(Integer key) {
		if (map.isEmpty()) {
			getMap();
		}
		return map.get(key);
	}
	
	public static void main(String[] args) {
		System.out.println(getText(2));
	}
}
