package cn.tuling;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class TulingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	// 执行时间:所有的Bean定义信息已经加载到容器中，但是Bean实例还没有被初始化.
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("IOC 容器调用了TulingBeanFactoryPostProcessor的postProcessBeanFactory方法");
		for(String name:beanFactory.getBeanDefinitionNames()) {
			if("tulingLog".equals(name)) {
				BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
				beanDefinition.setLazyInit(true);
			}

		}
	}
}
