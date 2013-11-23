package com.base;

import java.net.MalformedURLException;

import com.base.service.AttachmentService;
import com.caucho.hessian.client.HessianProxyFactory;

public class TestMain {
	public static void main(String[] args) {
		String url = "http://localhost:8080/base/attachmentService"; 
        HessianProxyFactory factory = new HessianProxyFactory(); 
        
        AttachmentService attachmentService = null;
		try {
			attachmentService = (AttachmentService) factory.create(AttachmentService.class, url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} 
		
		System.out.println(attachmentService.getName("aa ", 22));
		
	}
}
