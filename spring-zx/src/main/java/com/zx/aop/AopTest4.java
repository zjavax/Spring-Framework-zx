package com.zx.aop;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.*;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AopTest4 {

//	@Test
	public void test1() {
		//代理工厂
		ProxyFactory proxyFactory = new ProxyFactory(new FundsService());
		//添加一个方法前置通知，判断用户名不是“路人”的时候，抛出非法访问异常
		proxyFactory.addAdvice(new MethodBeforeAdvice() {
			@Override
			public void before(Method method, Object[] args, @Nullable Object target) throws Throwable {
				String userName = (String) args[0];
				//如果不是路人的时候，抛出非法访问异常
				if (!"路人".equals(userName)) {
					throw new RuntimeException(String.format("[%s]非法访问!", userName));
				}
			}
		});
		//通过代理工厂创建代理
		FundsService proxy = (FundsService) proxyFactory.getProxy();
		//调用代理的方法
		proxy.recharge("路人", 100);
		proxy.recharge("张学友", 100);
	}

	public static class SendMsgThrowsAdvice implements ThrowsAdvice {
		//注意方法名称必须为afterThrowing
		public void afterThrowing(Method method, Object[] args, Object target, RuntimeException e) {
			//监控到异常后发送消息通知开发者
			System.out.println("异常警报：");
			System.out.println(String.format("method:[%s]，args:[%s]", method.toGenericString(), Arrays.stream(args).collect(Collectors.toList())));
			System.out.println(e.getMessage());
			System.out.println("请尽快修复bug！");
		}
	}

//	@Test
	public void test2() {
		//目标对象
		FundsService target = new FundsService();
		//代理工厂
		ProxyFactory proxyFactory = new ProxyFactory(target);
		//添加一个异常通知，发现异常之后发送消息给开发者尽快修复bug
		proxyFactory.addAdvice(new SendMsgThrowsAdvice());
		//通过代理工厂创建代理
		FundsService proxy = (FundsService) proxyFactory.getProxy();
		//调用代理的方法
		proxy.cashOut("路人", 2000);

	}

	//	@Test
	public void testZx() {
		//1.创建代理所需参数配置（如：采用什么方式的代理、通知列表等）
		AdvisedSupport advisedSupport = new AdvisedSupport();
		//如：添加一个前置通知
		advisedSupport.addAdvice(new MethodBeforeAdvice() {
			@Override
			public void before(Method method, Object[] args, @Nullable Object target) throws Throwable {
				String userName = (String) args[0];
				//如果不是路人的时候，抛出非法访问异常
				if (!"路人".equals(userName)) {
					throw new RuntimeException(String.format("[%s]非法访问!", userName));
				}
			}
		});

//		advisedSupport.setExposeProxy(true);
//		advisedSupport.setProxyTargetClass(true);

		//设置被代理的目标对象
		FundsService target = new FundsService();
		advisedSupport.setTarget(target);


		//2.根据配置信息获取AopProxy对象，AopProxy用来负责创建最终的代理对象
		// AopProxy接口有2个实现类（JDK动态代理、cglib代理）
		// 具体最终会使用哪种方式，需要根据AdvisedSupport中指定的参数来判断
		// 创建AopProxy使用了简单工厂模式
		AopProxyFactory aopProxyFactory = new DefaultAopProxyFactory();
		//通过AopProxy工厂获取AopProxy对象
		AopProxy aopProxy = aopProxyFactory.createAopProxy(advisedSupport);

		//3.通过AopProxy创建代理对象
		Object proxy = aopProxy.getProxy();

	}

	public static void main(String[] args) {
		AopTest4 t = new AopTest4();
		t.test2();
	}
}
