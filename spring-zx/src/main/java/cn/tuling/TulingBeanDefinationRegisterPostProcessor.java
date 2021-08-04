package cn.tuling;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class TulingBeanDefinationRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor {
	// 执行时机:所有的bean定义信息将要被加载到容器中，Bean实例还没有被初始化。
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("TulingBeanDefinationRegisterPostProcessor的postProcessBeanDefinitionRegistry方法");
		System.out.println("bean定义的数据量:"+registry.getBeanDefinitionCount());
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(String.class);
		registry.registerBeanDefinition("tulingLog", rootBeanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("TulingBeanDefinationRegisterPostProcessor的postProcessBeanFactory方法");
		System.out.println(beanFactory.getBeanDefinitionCount());
	}
}
