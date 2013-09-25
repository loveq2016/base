package com.base.controller.systemmanage;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.controller.BaseController;
import com.base.model.DataDictionary;
import com.base.model.DataDictionaryExample;
import com.base.service.DataDictionaryService;
import com.base.util.Config;
import com.util.jackson.JacksonUtil;
import com.util.validator.ValidatorUtil;

/** 
 * 数据字典  Controller
 * @author willenfoo
 *
 */
@Controller
@RequestMapping(value="system/datadictionary/")
public class DataDictionaryController extends BaseController {

	@Resource
	private DataDictionaryService dataDictionaryService; //字典数据表, 服务层接口
	
	/**
	 * 查询出数据字典所有的数据
	 * @return
	 */
	@RequestMapping("find")
	public String find(ModelMap modelMap) {
		List<DataDictionary> dataDictionarys = dataDictionaryService.selectByExample(null);
		modelMap.put(result_value, JacksonUtil.writeValueAsString(dataDictionarys));
		return "system/datadictionary/find";
	}
	
	/**
	 * 添加  数据字典 或者 更新数据
	 * @param dataDictionary
	 * @return
	 */
	@RequestMapping(value="save",method=RequestMethod.POST)
	@ResponseBody
	public Object save(DataDictionary dataDictionary) {
		Map<String, Object> map = null;
		//1. 验证数据的有效性
		if (ValidatorUtil.validateAll(dataDictionary)) {
			map = getSuccessResult(Config.SUCCESS);
			//2. 验证数据用过，如果id存在就更新，否则就保存数据
			if (dataDictionary.getId() != null) {
				dataDictionaryService.updateById(dataDictionary);
			} else {
				dataDictionaryService.insert(dataDictionary);
			}
		} else {
			//数据有错误，返回错误提示信息
			map = getFailureResult(Config.FAILURE);
			map.put(message, Config.INVALID_REQUEST);
		}
		return map;
	}
	
	/**
	 * 删除  数据字典，包括该数据字典的子数据
	 * @param id
	 * @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	@ResponseBody
	public Object delete(@RequestParam("id") Integer id) {
		Map<String, Object> map = null;
		dataDictionaryService.delete(id);
		return map;
	}
			
}
