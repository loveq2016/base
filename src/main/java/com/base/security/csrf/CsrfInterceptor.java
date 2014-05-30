package com.base.security.csrf;

import java.net.URLEncoder;
import java.util.regex.*;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.util.string.StringUtil;
 
 
public class CsrfInterceptor extends HandlerInterceptorAdapter {
 
    @Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        if ("POST".equalsIgnoreCase(request.getMethod())) {
        	
            
        	String servletPath = request.getServletPath();
        	
        	Pattern p = Pattern.compile("find*");
            Matcher m = p.matcher(servletPath);
        	if (!m.find()) {
        		String csrfToken = CsrfTokenManager.getTokenFromRequest(request);
                if (csrfToken == null || 
                		!csrfToken.equals(request.getSession().getAttribute(CsrfTokenManager.CSRF_TOKEN_FOR_SESSION_ATTR_NAME))) {
                    /*String reLoginUrl = "/login?backurl=" + URLEncoder.encode(getCurrentUrl(request), "utf-8");
                    response.sendRedirect(reLoginUrl);
                    return false;*/
                }
        	}
        }
        return true;
    }
 
    private String getCurrentUrl(HttpServletRequest request) {
        String currentUrl = request.getRequestURL().toString();
        if (!StringUtil.isEmpty(request.getQueryString())) {
            currentUrl += "?" + request.getQueryString();
        }
        return currentUrl;
    }
}
