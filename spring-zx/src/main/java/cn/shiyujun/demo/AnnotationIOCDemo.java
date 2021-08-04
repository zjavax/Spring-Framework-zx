package cn.shiyujun.demo;

import cn.shiyujun.config.AnnotationConfig;
import cn.shiyujun.service.IOCService;
import cn.shiyujun.service.impl.IOCServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationIOCDemo {
    public static void main (String args[]){
		System.out.println(IOCService.class.isInterface());
		System.out.println(IOCServiceImpl.class.isInterface());


        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        IOCService iocService=context.getBean(IOCService.class);
        iocService.hello1();


    }
}
