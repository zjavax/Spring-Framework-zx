package org.springframework.atguigu1;

import cn.shiyujun.service.IOCService;
import org.springframework.atguigu1.config.AppConfig;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	public static void main(String[] args) {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-ioc.xml"));
		IOCService iocService= beanFactory.getBean(IOCService.class);
		System.out.println(iocService.hollo());

	}

}
