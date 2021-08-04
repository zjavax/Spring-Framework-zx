package cn.zx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MailBean {

	@Autowired
	ApplicationContext applicationContext;

	void sendMail() {
		SpringMailEvent springMailEvent = new SpringMailEvent(applicationContext);
		springMailEvent.setContent("mail");
		applicationContext.publishEvent(springMailEvent);
	}
}
