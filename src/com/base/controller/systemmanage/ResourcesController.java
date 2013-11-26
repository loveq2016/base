package com.base.controller.systemmanage;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.base.controller.BaseController;
import com.base.model.*;
import com.base.service.*;
import com.util.pager.Pager;

@Controller
@RequestMapping("system/resources/")
public class ResourcesController extends BaseController {

	@Resource
	private ResourcesService resourcesService;
	
	
	
	@RequestMapping(value="find")
	@ResponseBody
	public Object find(Resources resources) {
		Map<String, Object> map = getSuccessResult();
		ResourcesExample example = new ResourcesExample();
		example.setOrderByClause(" id desc ");
		ResourcesExample.Criteria criteria = example.createCriteria();
		 
		Pager pager = resourcesService.selectByPager(example, getOffset()-1, getPageSize());
		map.put(total, pager.getTotal());
		map.put(rows, pager.getList());
		return map;
	}
	
	@RequestMapping(value="save")
	@ResponseBody
	public Object save(Resources resources) {
		Map<String, Object> map = getSuccessResult();
		if (resources.getId() == null) {
			resourcesService.insert(resources);
		} else {
			resourcesService.updateById(resources);
		}
		return map;
	}
	
}