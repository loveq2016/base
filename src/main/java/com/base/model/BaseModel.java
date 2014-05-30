package com.base.model;

import java.util.List;


/**
 * 这个下面使用的代码生成器,应该尽力脱离代码生成器生成的代码, 因为后台要收集数据，所以把属性写在这里
 * 
 * @author willenfoo
 * 
 */
public abstract class BaseModel {

	private String temporary;// 临时数据， 比如到页面去显示一个值或者把数据库多表连接查询时，把数据临时放在这里属性中
	
	private Integer provisional;// 临时数据， 比如到页面去显示一个值或者把数据库多表连接查询时，把数据临时放在这里属性中
	
	private Integer findType; //查询类型,根据不同的查询类型，查询不同的数据
	
	private Object[] array;
	
	private String state;
	
	private List<?> children; //为了 jquery easyui 树形结构展示， 子节点
	
	private boolean checked;
	 
	private String token; // CSRF防御token
	
	public String getTemporary() {
		return temporary;
	}

	public void setTemporary(String temporary) {
		this.temporary = temporary;
	}

	public Integer getProvisional() {
		return provisional;
	}

	public void setProvisional(Integer provisional) {
		this.provisional = provisional;
	}
	
	public Integer getFindType() {
		return findType;
	}

	public void setFindType(Integer findType) {
		this.findType = findType;
	}

	public Object[] getArray() {
		return array;
	}

	public void setArray(Object[] array) {
		this.array = array;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public List<?> getChildren() {
		return children;
	}

	public void setChildren(List<?> children) {
		this.children = children;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
