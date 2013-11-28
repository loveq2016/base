package com.base.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.base.service.ServiceMapping;
import com.util.http.HttpUtil;
import com.util.string.StringUtil;

/** 
 * 所有Controller都应该继承该类，但是要看具体需求
 * @author willenfoo
 */    
@Controller
public class BaseController {
	  
	protected final static String message = "msg"; //返回页面的提示信息

	protected final static String code = "code"; //返回的的状态码
	
	protected final static String total = "total"; //整数
	
	protected final static String result_value = "resultValue"; //返回的的状态码

	protected final static String items = "items"; //返回json数据的或者list数据的key名称
	
	protected final static String rows = "rows"; //返回json数据的或者list数据的key名称

	protected final static String redirect = "redirect:"; //重定向页面
	
	protected final static String HTTP_OK = "200"; //请求成功码
	
	protected final static String HTTP_NO = "201"; //请求错误码
	
	protected final static String SUCCESS_TEXT = "操作成功!";
	
	protected final static String FAILURE_TEXT = "操作失败!";
	
	/**
	 * 得到HttpServletRequest对象
	 * @return
	 */
	protected HttpServletRequest getRequest() {
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
	}
	
	/**
	 * 判断用户是post请求还是get请求，get请求返回一个页面就ok，post处理一些业务，
	 * 比如跳转到登录页面的url， get负责跳转到页面，post负责登录请求
	 * 
	 * @return
	 */
	protected boolean isPost() {
		if ("post".equalsIgnoreCase(getRequest().getMethod())
				&& "isPost".equalsIgnoreCase(getRequest()
						.getParameter("isPost"))) {
			return true;
		} else {
			return false;
		}
	}
	
	protected Integer getOffset() {
		String offset = getRequest().getParameter("page");
		if (StringUtil.isInteger(offset)) {
			return Integer.valueOf(offset);
		}
		return 0;
	}
	
	protected Integer getPageSize() {
		String pageSize = getRequest().getParameter("rows");
		if (StringUtil.isInteger(pageSize)) {
			return Integer.valueOf(pageSize);
		}
		return 10;
	}
	
	/**
	 * 这个方法适合所有的页面跳转，前提是页面不需要加载数据中的数据，或者是前台通过ajax加载
	 * 都这个通过这个方法跳转
	 * @param address JSP页面地址
	 * @param modelAttribute spring from 标签需要的model
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("forward/{bigModule}/{smallModule}/{viewName}")
	public String forward(@PathVariable("bigModule") String bigModule,
			@PathVariable("smallModule") String smallModule,
			@PathVariable("viewName") String viewName) {
		return bigModule + "/" + smallModule + "/"  + viewName;
	}
  
	/**
	 * 这个方法适合所有的页面跳转，前提是页面不需要加载数据中的数据，或者是前台通过ajax加载
	 * 都这个通过这个方法跳转
	 * @param address JSP页面地址
	 * @param modelAttribute spring from 标签需要的model
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("forward/{bigModule}/{viewName}")
	public String forward(@PathVariable("bigModule") String bigModule,
			@PathVariable("viewName") String viewName) {
		return bigModule + "/" + viewName;
	}
	
	/**
	 * 保存对象
	 * @param modelName 对应的要保存到数据库的 model 名称
	 * @return
	 */
	@RequestMapping("execute/{modelName}/save")
	@ResponseBody
	public Object save(@PathVariable("modelName") String modelName) {
		return ServiceMapping.insertMapping(HttpUtil.getParameterMap(getRequest()), getModelPackage(modelName));
	}
	
	/**
	 * 根据ID删除    单个对象
	 * @param modelName 对应的要保存到数据库的 model 名称
	 * @return
	 */
	@RequestMapping("execute/{modelName}/deleteById")
	@ResponseBody
	public Object deleteById(@PathVariable("modelName") String modelName) {
		return ServiceMapping.deleteByIdMapping(HttpUtil.getParameterMap(getRequest()), getModelPackage(modelName));
	}
	
	/**
	 * 根据帮助类删除对象
	 * @param modelName 对应的要保存到数据库的 model 名称
	 * @return
	 */
	@RequestMapping("execute/{modelName}/delete")
	@ResponseBody
	public Object delete(@PathVariable("modelName") String modelName) {
		return ServiceMapping.deleteByExampleMapping(HttpUtil.getParameterMap(getRequest()), getModelPackage(modelName));
	}
	
	/**
	 * 根据ID更新  单个 对象
	 * @param modelName 对应的要保存到数据库的 model 名称
	 * @return
	 */
	@RequestMapping("execute/{modelName}/updateById")
	@ResponseBody
	public Object updateById(@PathVariable("modelName") String modelName) {
		return ServiceMapping.updateByIdMapping(HttpUtil.getParameterMap(getRequest()), getModelPackage(modelName));
	}
	
	/**
	 * 根据帮助类更新对象
	 * @param modelName 对应的要保存到数据库的 model 名称
	 * @return
	 */
	@RequestMapping("execute/{modelName}/update")
	@ResponseBody
	public Object update(@PathVariable("modelName") String modelName) {
		return ServiceMapping.updateByExampleMapping(HttpUtil.getParameterMap(getRequest()), getModelPackage(modelName));
	}
	
	/**
	 * 根据ID查找单个对象
	 * @param modelName 对应的要保存到数据库的 model 名称
	 * @return
	 */
	@RequestMapping("execute/{modelName}/findById")
	@ResponseBody
	public Object findById(@PathVariable("modelName") String modelName) {
		return ServiceMapping.selectByIdMapping(HttpUtil.getParameterMap(getRequest()), getModelPackage(modelName));
	}
	
	/**
	 * 根据帮助类 查找单个对象
	 * @param modelName 对应的要保存到数据库的 model 名称
	 * @return
	 */
	@RequestMapping("execute/{modelName}/findByModel")
	@ResponseBody
	public Object findByModel(@PathVariable("modelName") String modelName) {
		return  ServiceMapping.selectByModelMapping(HttpUtil.getParameterMap(getRequest()), getModelPackage(modelName));
	}
	
	/**
	 * 根据帮助类查找对象
	 * @param modelName 对应的要保存到数据库的 model 名称
	 * @return
	 */
	@RequestMapping("execute/{modelName}/find")
	@ResponseBody
	public Object find(@PathVariable("modelName") String modelName) {
		return ServiceMapping.selectByExampleMapping(HttpUtil
				.getParameterMap(getRequest()), getModelPackage(modelName),getOffset(), getPageSize());
	}
	
	/**
	 * 根据帮助类查找对象
	 * @param modelName 对应的要保存到数据库的 model 名称
	 * @return
	 */
	@RequestMapping("execute/{modelName}/{methodName}")
	@ResponseBody
	public Object find(@PathVariable("modelName") String modelName,@PathVariable("methodName") String methodName) {
		return null;
	}
	
	
	/**
	 * 得到 model 的包名
	 * @param modelName
	 * @return
	 */
	private static String getModelPackage(String modelName) {
		String thisPackage = BaseController.class.getName();
		return thisPackage.substring(0, thisPackage.lastIndexOf("controller"))+"model."+StringUtil.firstLetterToUpperCase(modelName);
	}
	
	/**
	 * 重定向URL
	 * @param address 地址
	 * @return
	 */
	public String redirect(String address) {
		return redirect + address;
	}

	/**
	 * 返回失败的标识方法
	 * @return
	 */
	public Map<String, Object> getFailureResult() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(code, HTTP_NO);
		return map;
	}  
	
	/**
	 * 返回失败的标识方法
	 * @return
	 */
	public Map<String, Object> getFailureResult(String msg) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(code, HTTP_NO);
		map.put(message, msg);
		return map;
	}
	
	/**
	 * 返回成功的标识方法
	 * @return
	 */
	public Map<String, Object> getSuccessResult() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(code, HTTP_OK); 
		map.put(message, SUCCESS_TEXT);
		return map;
	}
	
	/**
	 * 返回成功的标识方法
	 * @return
	 */
	public Map<String, Object> getSuccessResult(String msg) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(code, HTTP_OK);  
		map.put(message, msg);
		return map;
	}
		
	@InitBinder
	protected void initBinder(ServletRequestDataBinder binder) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CustomDateEditor editor = new CustomDateEditor(df, false);
		binder.registerCustomEditor(Date.class, editor);
		
		df = new SimpleDateFormat("yyyy-MM-dd");
		editor = new CustomDateEditor(df, false);
		binder.registerCustomEditor(Date.class, editor);
	}
}
