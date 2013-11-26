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
@RequestMapping("system/auth/")
public class AuthController extends BaseController {

	@Resource
	private AuthoritiesService authoritiesService;
	
	
	
	@RequestMapping(value="find")
	@ResponseBody
	public Object find(Authorities authorities) {
		Map<String, Object> map = getSuccessResult();
		AuthoritiesExample example = new AuthoritiesExample();
		example.setOrderByClause(" id desc ");
		AuthoritiesExample.Criteria criteria = example.createCriteria();
		 
		Pager pager = authoritiesService.selectByPager(example, getOffset()-1, getPageSize());
		map.put(total, pager.getTotal());
		map.put(rows, pager.getList());
		return map;
	}
	
	@RequestMapping(value="save")
	@ResponseBody
	public Object save(Authorities authorities) {
		Map<String, Object> map = getSuccessResult();
		if (authorities.getId() == null) {
			authoritiesService.insert(authorities);
		} else {
			authoritiesService.updateById(authorities);
		}
		return map;
	}
	
}