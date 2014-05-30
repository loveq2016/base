package com.base.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

import com.util.http.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AjaxAwareAuthenticationEntryPoint 
             extends LoginUrlAuthenticationEntryPoint {

    public AjaxAwareAuthenticationEntryPoint(String loginUrl) {
        super(loginUrl);
    }

    @Override
    public void commence(
        HttpServletRequest request, 
        HttpServletResponse response, 
        AuthenticationException authException) 
            throws IOException, ServletException {

        if (HttpUtil.isAjaxRequest(request)) {
            response.sendError(403, "Forbidden");
        } else {
            super.commence(request, response, authException);
        }
    }
}
