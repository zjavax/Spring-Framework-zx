package com.zx.aop.methodInterceptor;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class MyMethodInteceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("123");
		invocation.proceed();
		return null;
	}

	public static void main(String[] args) {


	}
}
