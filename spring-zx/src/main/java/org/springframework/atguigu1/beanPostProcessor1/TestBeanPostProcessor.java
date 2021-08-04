//package org.springframework.atguigu1.beanPostProcessor1;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.core.PriorityOrdered;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TestBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {
//
//	@Override
//	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		if (beanName.equals("x")) {
//			System.out.println("postProcessBeforeInitialization");
//		}
//		return bean;
//	}
//
//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		if (beanName.equals("x")) {
//			System.out.println("postProcessAfterInitialization");
//		}
//		return bean;
//	}
//
//	@Override
//	public int getOrder() { // 后置处理器的顺序执行
//		return 100;
//	}
//}
