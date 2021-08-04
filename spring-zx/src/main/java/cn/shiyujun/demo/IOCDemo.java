package cn.shiyujun.demo;

import cn.shiyujun.service.IOCService;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author syj
 * CreateTime 2019/7/18
 * describe:
 */
public class IOCDemo {
    public static void main (String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-ioc.xml");

//		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) context.getAutowireCapableBeanFactory();
//		defaultListableBeanFactory.registerBeanDefinition();

		IOCService iocService=context.getBean(IOCService.class);
        System.out.println(iocService.hollo());
    }
}
