package com.base.controller.systemmanage;

import java.util.*;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	
	@Resource
	private RoleResourcesService roleResourcesService;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="find")
	@ResponseBody
	public Object find(Resources resources) {
		Map<String, Object> map = getSuccessResult();
		ResourcesExample example = new ResourcesExample();
		example.setColumn("id, name, link_url, description, parent_id, sequence, type, creator, creation_time, (select count(*) from tb_resources as cr where cr.parent_id = r.id) as provisional");
		example.setOrderByClause(" sequence  ");
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
	
	@RequestMapping(value="findByRoleId")
	@ResponseBody
	public Object findByRoleId(@RequestParam("roleId") Integer roleId) {
		Map<String, Object> map = getSuccessResult();
		map.put(rows, resourcesService.selectByRoleId(roleId));
		return map;
	}
	
	@RequestMapping(value = "delRoleResources")
	@ResponseBody
	public Object delRoleResources(@RequestParam("roleId") Integer roleId,
			@RequestParam("resourcesId") Integer resourcesId) {
		Map<String, Object> map = getSuccessResult();
		RoleResourcesExample example = new RoleResourcesExample();
		RoleResourcesExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		criteria.andResourcesIdEqualTo(resourcesId);
		roleResourcesService.deleteByExample(example);
		return map;
	}
	
	/**
	 * 修改/编辑 页
	 * @param id
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "edit")
	public String edit(@RequestParam(value="id",required=false) Integer id, ModelMap modelMap) {
		if (id != null) {
			modelMap.put(ITEM, resourcesService.selectById(id));
		}
		return "system/resources/edit";
	}
	
}