package com.base.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.base.service.impl.BaseServiceImpl;
import com.base.model.DataDictionary;
import com.base.model.DataDictionaryExample;
import com.base.dao.impl.DataDictionaryMapperImpl;
import com.base.dao.DataDictionaryMapper;
import com.base.service.DataDictionaryService;

@Service("dataDictionaryService")
public class DataDictionaryServiceImpl
		extends
		BaseServiceImpl<DataDictionary, DataDictionaryExample, DataDictionaryMapperImpl>
		implements DataDictionaryService {
	
	private DataDictionaryMapper dataDictionaryMapper;

	@Resource
	public void setDataDictionaryMapper(
			DataDictionaryMapper dataDictionaryMapper) {
		this.dataDictionaryMapper = dataDictionaryMapper;
		super.setBaseDao((DataDictionaryMapperImpl) dataDictionaryMapper);
	}

	@Override
	public void delete(Integer id) {
		//1. 首先查找此数据  是否有子数据字典
		
	}
}