package com.base.controller.systemmanage;

import java.util.*;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.base.controller.BaseController;
import com.base.model.*;
import com.base.service.*;
import com.base.util.Constants;
import com.util.pager.Pager;

@Controller
@RequestMapping("system/resources/")
public class ResourcesController extends BaseController {

	@Resource
	private ResourcesService resourcesService;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="find")
	@ResponseBody
	public Object find(Resources resources) {
		Map<String, Object> map = getSuccessResult();
		ResourcesExample example = new ResourcesExample();
		example.setColumn("id, name, link_url, description, parent_id, sequence, type, creator, creation_time, (select count(*) from tb_resources as cr where cr.parent_id = r.id) as provisional");
		example.setOrderByClause(" id desc ");
		example.setJoin(" as r ");
		ResourcesExample.Criteria criteria = example.createCriteria();
		if (resources.getId() == null) {
			criteria.andParentIdEqualTo(Constants.TOP_DATA);
			Pager pager = resourcesService.selectByPager(example, getOffset()-1, getPageSize());
			map.put(rows, getList((List<Resources>) pager.getList()));
			map.put(total, pager.getTotal());
		} else {
			criteria.andParentIdEqualTo(resources.getId());
			return getList(resourcesService.selectByExample(example));
		}
		return map;
	}
	
	private List<Resources> getList(List<Resources> list) {
		if (list != null && !list.isEmpty()) {
			for (Resources resources : list) {
				if (resources.getProvisional() > 0) {
					resources.setState("closed");
				} else {
					resources.setState("open");
				}
			}
		}
		return list;
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