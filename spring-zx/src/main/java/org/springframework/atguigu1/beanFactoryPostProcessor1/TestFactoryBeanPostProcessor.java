//package org.springframework.atguigu1.beanFactoryPostProcessor1;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
//import org.springframework.core.PriorityOrdered;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TestFactoryBeanPostProcessor implements BeanFactoryPostProcessor {
//
//	@Override
//	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		AnnotatedBeanDefinition x = (AnnotatedBeanDefinition)beanFactory.getBeanDefinition("x");
//		x.setScope("prototype");
//	}
//}
