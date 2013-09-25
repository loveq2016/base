package com.base.service;

import com.base.model.DataDictionary;
import com.base.model.DataDictionaryExample;
import com.base.service.BaseService;

public interface DataDictionaryService extends
		BaseService<DataDictionary, DataDictionaryExample> {

	/**
	 * 删除  数据字典，包括该数据字典的子数据
	 * @param id
	 */
	void delete(Integer id);
}