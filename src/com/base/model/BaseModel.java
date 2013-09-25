package com.base.model;


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
	

}
