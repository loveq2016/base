package com.base.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Aspect
// 这个是组件注解，因为我开启了自动扫描再xml文件里
@Controller
public class AopExample {
	
	/*@Pointcut("execution(* com.base.service.impl.AttachmentServiceImpl.getName(..))")
	public void userCut() {
	}

	
	// 方法执行前开始下面代码
	@Before("userCut()")
	public void doAccessCheck() {
		System.out.println("前置通知");
	}

	// 方法执行完毕开始下面代码
	@AfterReturning(pointcut = "userCut()")
	public void afterReturning() {
		System.out.println("后置通知,返回id为");
	}

	// 相当于final语句块，
	@After("userCut()")
	public void after() {
		System.out.println("最后通知");
	}

	@AfterThrowing(pointcut = "userCut()", throwing = "e")
	public void afterThrowtin(Exception e) {
		System.out.println("异常通知" + e);
	}

	@Around("userCut()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Ending method : " + pjp.getTarget().getClass() + "." + pjp.getSignature().getName());
		System.out.println("开始环绕通知");// 前置通知后执行
		Object obj = pjp.proceed();// 此处返回的是拦截的方法的返回值，如果不执行此方法，则不会执行被拦截的方法，利用环绕通知可以很好的做权限管理
		System.out.println(obj + "结束环绕通知");// 后置通知后、最后通知前执行
		return obj;
	}*/
}
