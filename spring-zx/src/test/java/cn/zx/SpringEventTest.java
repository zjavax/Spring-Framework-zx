package cn.zx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =
			new AnnotationConfigApplicationContext(AppConfig.class);
		ac.getBean(MailBean.class).sendMail();


	}
}
