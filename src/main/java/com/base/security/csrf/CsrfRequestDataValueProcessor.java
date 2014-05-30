package com.base.security.csrf;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.RequestDataValueProcessor;

@Component("requestDataValueProcessor")
public class CsrfRequestDataValueProcessor implements RequestDataValueProcessor {

	@Override
	public String processAction(HttpServletRequest request, String action) {
		return action;
	}

	@Override
	public String processFormFieldValue(HttpServletRequest request, String name, String value, String type) {
		return value;
	}

	@Override
	public Map<String, String> getExtraHiddenFields(HttpServletRequest request) {
		// 此处是当使用spring的taglib标签<form:form>创建表单时候，增加的隐藏域参数
		Map<String, String> hiddenFields = new HashMap<String, String>();
		hiddenFields.put(CsrfTokenManager.CSRF_PARAM_NAME, CsrfTokenManager.createTokenForSession(request.getSession()));
		return hiddenFields;

	}

	@Override
	public String processUrl(HttpServletRequest request, String url) {
		return url;
	}

}
