package com.base.enums;

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
	
	
}
