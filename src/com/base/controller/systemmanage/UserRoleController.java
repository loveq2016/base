package com.base.controller.systemmanage;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.controller.BaseController;
import com.base.service.UserRoleService;

@Controller
@RequestMapping("system/userRole/")
public class UserRoleController extends BaseController {

	@Resource
	private UserRoleService userRoleService;
	
	@RequestMapping(value = "findByUserId")
	@ResponseBody
	public Object findByUserId(@RequestParam("userId") Integer userId) {
		Map<String, Object> map = getSuccessResult();
		map.put(rows, userRoleService.findByUserId(userId));
		return map;
	}
}
