package org.springframework.atguigu1.ApplicationListener1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class MyApplicationContextEvent extends ApplicationContextEvent {
	public MyApplicationContextEvent(ApplicationContext source) {
		super(source);
	}
}
