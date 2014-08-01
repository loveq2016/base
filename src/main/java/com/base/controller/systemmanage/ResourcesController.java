package com.base.controller.systemmanage;

import java.util.*;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.base.controller.BaseController;
import com.base.enums.resources.Type;
import com.base.model.*;
import com.base.service.*;
import com.base.util.Constants;
import com.util.pager.Pager;

/**
 * 资源管理 模块 Controller
 * @author willenfoo
 *
 */
@Controller
@RequestMapping("system/resources/")
public class ResourcesController extends BaseController {

	/**
	 * 显示视图 
	 * @param action 当前的操作，  1000 代表是 显示 角色 数据集合， 1001是添加角色，1002是修改角色
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("showView/{actionCode}")
	public String showView(@PathVariable String actionCode, ModelMap modelMap) {
		if ("1000".equals(actionCode)) {
			return "system/resources/show";
		} else if ("1001".equals(actionCode)) {
			modelMap.put("resources", new Resources());
			return "system/resources/edit";
		} else if ("1002".equals(actionCode)) {
			if (getId() != null) {
				try {
					Resources resources = resourcesService.selectById(getId());
					modelMap.put("resources", resources);
				} catch (Exception e) {
					e.printStackTrace();
					LOG.error(Constants.DB_ERROR_TEXT, e);
					throw new RuntimeException(Constants.DB_ERROR_TEXT);
				}
			}
			return "system/resources/edit";
		} else {
			return null;
		}
	}
	
	/**
	 * 查询资源
	 * @param resources
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="find")
	@ResponseBody
	public Object find(Resources resources) {
		Map<String, Object> map = getSuccessResult();
		ResourcesExample example = new ResourcesExample();
		example.setColumn("id, name, link_url,code, description, parent_id, sequence, type, creator, creation_time, (select count(*) from tb_resources as cr where cr.parent_id = r.id) as provisional");
		example.setOrderByClause(" sequence  ");
		example.setJoin(" as r ");
		ResourcesExample.Criteria criteria = example.createCriteria();
		if (resources.getId() == null) {
			criteria.andParentIdEqualTo(Constants.TOP_DATA);
			Pager pager;
			try {
				pager = resourcesService.selectByPager(example, getOffset()-1, getPageSize());
			} catch (Exception e) {
				e.printStackTrace();
				LOG.error(Constants.DB_ERROR_TEXT, e);
				throw new RuntimeException(Constants.DB_ERROR_TEXT);
			}
			map.put(rows, getList((List<Resources>) pager.getList()));
			map.put(total, pager.getTotal());
		} else {
			criteria.andParentIdEqualTo(resources.getId());
			return getList(resourcesService.selectByExample(example));
		}
		return map;
	}
	
	 
	/**
	 * 查询资源，现成树形结构
	 * @param resources
	 * @return
	 */
	@RequestMapping(value="findAll")
	@ResponseBody
	public Object findAll(Resources resources) {
		Map<String, Object> map = getSuccessResult();
		try {
			List<Resources> list = resourcesService.selectByExample(null);
			map.put(rows, setChildren(list));
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	/**
	 * 把list形成树形结构，设置子节点
	 * @param list
	 * @return
	 */
	public List<Resources> setChildren(List<Resources> list) {
		List<Resources> oneLevel = new ArrayList<Resources>();
		if (list != null && !list.isEmpty()) {
			for (Resources resources : list) {
				if (Constants.TOP_DATA.equals(resources.getParentId())) {
					List<Resources> twoLevel = getChildren(resources.getId(), list);
					for (Resources resources2 : twoLevel) {
						List<Resources> threeLevel = getChildren(resources2.getId(), list);
						resources2.setChildren(threeLevel);
					}
					resources.setChildren(twoLevel);
					oneLevel.add(resources);
				}
			}
		}
		return oneLevel;
	}
	
	/**
	 * 得到id中的子节点
	 * @param id
	 * @param list
	 * @return
	 */
	public List<Resources> getChildren(Integer id, List<Resources> list) {
		List<Resources> children = new ArrayList<Resources>();
		for (Resources resources : list) {
			if (id.equals(resources.getParentId())) {
				children.add(resources);
			}
		}
		return children;
	}
	
	/**
	 * 根据资源集合，判断是否有子节点，如果有子节点，state为打开状态，否则为关闭
	 * @param list
	 * @return
	 */
	private List<Resources> getList(List<Resources> list) {
		if (list != null && !list.isEmpty()) {
			for (Resources resources : list) {
				if (resources.getProvisional() > 0) {
					resources.setState("closed");
				} else {
					resources.setState("open");
				}
				resources.setTypeText(Type.getText(resources.getType()));
			}
		}
		return list;
	}
	
	/**
	 * 添加资源
	 * @param user
	 * @return
	 */
	@RequestMapping(value="add")
	@ResponseBody
	public Object add(Resources resources) {
		Map<String, Object> map = getSuccessResult();
		try {
			if (resources.getParentId() == null) {
				resources.setParentId(Constants.TOP_DATA);
			}
			resourcesService.insert(resources);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	/**
	 * 更新资源
	 * @param user
	 * @return
	 */
	@RequestMapping(value="update")
	@ResponseBody
	public Object update(Resources resources) {
		Map<String, Object> map = getSuccessResult();
		try {
			if (resources.getId() != null) {
				resourcesService.updateById(resources);
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	/**
	 * 根据角色id与资源id， 删除关连关系
	 * @param roleId
	 * @param resourcesId
	 * @return
	 */
	@RequestMapping(value = "delRoleResources")
	@ResponseBody
	public Object delRoleResources(@RequestParam("roleId") Integer roleId,
			@RequestParam("resourcesId") Integer resourcesId) {
		Map<String, Object> map = getSuccessResult();
		RoleResourcesExample example = new RoleResourcesExample();
		RoleResourcesExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		criteria.andResourcesIdEqualTo(resourcesId);
		try {
			roleResourcesService.deleteByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	/**
	 * 删除资源
	 * @param id
	 * @return
	 */
	@RequestMapping(value="delete")
	@ResponseBody
	public Object delete(@RequestParam("id") Integer id) {
		Map<String, Object> map = getSuccessResult();
		
		try {
			resourcesService.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	/**
	 * 保存    角色与资源 关系
	 * @param roleIds
	 * @param resourcesIds
	 * @return
	 */
	@RequestMapping(value="saveRoleResources")
	@ResponseBody
	public Object saveRoleResources(@RequestParam("roleIds") Integer[] roleIds,
			@RequestParam("resourcesIds") Integer[] resourcesIds) {
		Map<String, Object> map = getSuccessResult();
		if (roleIds.length == resourcesIds.length) {
			List<RoleResources> list = new ArrayList<RoleResources>();
			for (int i = 0; i < roleIds.length; i++) {
				RoleResources rr = new RoleResources();
				rr.setRoleId(roleIds[i]);
				rr.setResourcesId(resourcesIds[i]);
				list.add(rr);
			}
			try {
				roleResourcesService.saveRoleResources(roleIds[0], list);
			} catch (Exception e) {
				e.printStackTrace();
				LOG.error(Constants.DB_ERROR_TEXT, e);
				throw new RuntimeException(Constants.DB_ERROR_TEXT);
			}
		}
		return map;
	}
	
	/**
	 * 根据角色id，查询该角色可以访问的资源
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value="findByRoleId")
	@ResponseBody
	public Object findByRoleId(@RequestParam("roleId") Integer roleId) {
		RoleResourcesExample example = new RoleResourcesExample();
		RoleResourcesExample.Criteria criteria  = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		try {
			return roleResourcesService.selectByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT, e);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
	}
	
	@Resource
	private ResourcesService resourcesService; //资源服务层
	
	@Resource
	private RoleResourcesService roleResourcesService; //角色资源服务层
	
	private final static Log LOG = LogFactory.getLog(ResourcesController.class);
}