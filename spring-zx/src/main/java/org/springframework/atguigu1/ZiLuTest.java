package org.springframework.atguigu1;

import org.springframework.atguigu1.ApplicationListener1.MyApplicationContextEvent;
import org.springframework.atguigu1.config.AppConfig;
import org.springframework.atguigu1.shadow.ImportSelector1.Y1;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZiLuTest {

	// BeanDefinition
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext("org.springframework.atguigu1.shadow");
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		ac.register(AppConfig.class);



//		ac.registerBeanDefinition();
//		ac.addBeanFactoryPostProcessor();
//		ac.addBeanFactoryPostProcessor(new TulingBeanFactoryPostProcessor());

//		ac.setAllowCircularReferences(false);  关闭循环依赖
//		ac.refresh();

		// 扫描包存到bdMap，name放在一个list里
//		ac.register(X.class);
////		ac.addBeanFactoryPostProcessor(new);
//		ac.refresh();
//		X x = ac.getBean(X.class);
//		Y y = ac.getBean(Y.class);
//		Y1 y1 = ac.getBean(Y1.class);
//		X x2 = ac.getBean(X.class);
//		System.out.println(x + "====" + "x2");
//		x.query();

//		ac.scan("org.springframework.atguigu1.shadow");


		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		//手动发布一个事件
		ctx.publishEvent(new ApplicationEvent("我手动发布了一个事件") {
			@Override
			public Object getSource() {
				return super.getSource();
			}
		});

//		ctx.publishEvent(new MyApplicationContextEvent(ctx) {
//			@Override
//			public Object getSource() {
//				return super.getSource();
//			}
//		});




		//容器关闭也发布事件
		ctx.close();


	}

}
