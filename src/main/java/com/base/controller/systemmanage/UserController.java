package com.base.controller.systemmanage;

import java.util.*;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import com.base.controller.BaseController;
import com.base.enums.user.Gender;
import com.base.exception.SystemException;
import com.base.model.User;
import com.base.model.UserExample;
import com.base.service.UserService;
import com.base.util.Constants;
import com.base.validator.user.UserAddValidator;
import com.base.validator.user.UserUpdateValidator;
import com.util.md5.Md5Util;
import com.util.pager.Pager;
import com.util.string.StringUtil;

/**
 * 用户管理 模块 Controller
 * @author willenfoo
 *
 */
@Controller
@RequestMapping("system/user/")
public class UserController extends BaseController {

	/**
	 * 初始化 binder，根据 请求的 URL 不同，初始化不同的数据
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		String servletPath = getRequest().getServletPath();
		
		// 初始化 添加 方法
		if (servletPath.indexOf("add") != -1) {
			//设置  添加 方法 的 Validator
			binder.setValidator(new UserAddValidator());
			
			//设置  添加 方法 要 收集参数 的 字段
			binder.setAllowedFields(UserAddValidator.FIELDS);
		}
		// 初始化 修改 方法
		else if (servletPath.indexOf("update") != -1) {
			//设置  修改 方法 的 Validator
			binder.setValidator(new UserUpdateValidator());
			
			//设置  修改  方法 要 收集参数 的 字段
			binder.setAllowedFields(UserUpdateValidator.FIELDS);
		}
	}
	
	/**
	 * 显示视图 
	 * @param action 当前的操作，  1000 代表是 显示 用户 数据集合， 1001是添加用户，1002是修改用户
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("showView/{actionCode}")
	public String showView(@PathVariable String actionCode,ModelMap modelMap) {
		if ("1000".equals(actionCode)) {
			//显示 用户 数据集合 页面
			return "system/user/show";
		} else if ("1001".equals(actionCode)) {
			//添加用户  页面
			modelMap.put("user", new User());
			return "system/user/edit";
		} else if ("1002".equals(actionCode)) {
			//修改用户 页面
			if (getId() != null) {
				try {
					User user = userService.selectById(getId());
					modelMap.put("user", user);
				} catch (Exception e) {
					e.printStackTrace();
					LOG.error(Constants.DB_ERROR_TEXT);
					throw new RuntimeException(Constants.DB_ERROR_TEXT);
				}
			}  
			return "system/user/edit";
		} else if ("1003".equals(actionCode)) {
			return "system/user/edit";
		} else {
			return null;
		}
	}
	
	/**
	 * 查找用户 
	 * @param user
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="find")
	@ResponseBody
	public Object find(User user) {
		Map<String, Object> map = getSuccessResult();
		UserExample example = new UserExample();
		example.setOrderByClause(" id desc ");
		UserExample.Criteria criteria = example.createCriteria();
		
		//用户名模糊查询
		if (StringUtil.isNotEmpty(user.getUserName())) {
			criteria.andUserNameLike("%"+user.getUserName()+"%");
		}
		//性别查询
		if (user.getGender() != null) {
			criteria.andGenderEqualTo(user.getGender());
		}
		
		//年龄查询
		if (user.getAge() != null && user.getProvisional() != null) {
			criteria.andAgeBetween(user.getAge(), user.getProvisional());
		} else if (user.getAge() != null && user.getProvisional() == null) {
			criteria.andAgeGreaterThanOrEqualTo(user.getAge());
		} else if (user.getAge() == null && user.getProvisional() != null) {
			criteria.andAgeLessThanOrEqualTo(user.getProvisional());
		}
		
		
		Pager pager;
		try {
			pager = userService.selectByPager(example, getOffset()-1, getPageSize());
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		
		List<User> list = (List<User>)pager.getList();
		
		//循环，把 code 替换 成 text
		if (list != null && !list.isEmpty()) {
			for (User replaceUser : list) {
				replaceUser.setGenderText(Gender.getText(replaceUser.getGender()));
			}
		}
		map.put(total, pager.getTotal());
		map.put(rows, list);
		return map;
	}
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value="add")
	@ResponseBody
	public Object add(@Validated User user,BindingResult br) {
		Map<String, Object> map = getSuccessResult();
		try {
			//把密码 加密成   md5 保存
			user.setPassword(Md5Util.getMD5(user.getPassword()));
			userService.insertUser(user);
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	/**
	 * 更新用户 
	 * @param user
	 * @return
	 */
	@RequestMapping(value="update")
	@ResponseBody
	public Object update(@Valid User user,BindingResult br) {
		if (br.hasErrors()) {
			return getFailureResult(DATA_ILLEGAL);
		} else {
			Map<String, Object> map = getSuccessResult();
			try {
				if (user.getId() != null) {
					userService.updateById(user);
				}
			} catch (Exception e) {
				e.printStackTrace();
				LOG.error(Constants.DB_ERROR_TEXT);
				throw new RuntimeException(Constants.DB_ERROR_TEXT);
			}
			return map;
		}
	}
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value="delete")
	@ResponseBody
	public Object delete(@RequestParam("id") Integer id) {
		Map<String, Object> map = getSuccessResult();
		try {
			userService.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	} 
	
	/**
	 * 判断用户名是否存在
	 * @param userName
	 * @return
	 */
	@RequestMapping(value="isExist")
	@ResponseBody
	public Object isExist(@RequestParam("userName") String userName) {
		Map<String, Object> map = getSuccessResult("该用户名可以注册!");
		try {
			if (userService.isExist(userName)) {
				map = getFailureResult("该用户名已经存在!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	/**
	 * 跳转到 重置密码 页面
	 * @return
	 */
	@RequestMapping(value="toResetPassword")
	public String toResetPassword() {
		return "system/user/resetPassword";
	}
	
	/**
	 * 重置密码
	 * @return
	 */
	@RequestMapping(value="resetPassword")
	@ResponseBody
	public Object resetPassword(@RequestParam("id") Integer id,
			@RequestParam("oldPassword") String oldPassword, 
			@RequestParam("newPassword") String newPassword) {
		
		Map<String, Object> map = getSuccessResult();
		try {
			User user = userService.selectById(id);
			//查询  旧密码 是否 正确
			if (user != null) {
				if (Md5Util.getMD5(oldPassword).equals(user.getPassword())) {
					// 旧密码   正确
					user.setPassword(Md5Util.getMD5(newPassword));
					userService.updateById(user);
				} else {
					// 旧密码  错误
					map = getFailureResult("旧密码错误!", ERROR);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(Constants.DB_ERROR_TEXT);
			throw new RuntimeException(Constants.DB_ERROR_TEXT);
		}
		return map;
	}
	
	@Resource
	private UserService userService;
	
	private final static Log LOG = LogFactory.getLog(UserController.class); 
}