package org.springframework.atguigu1.ApplicationListener1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TulingApplicationListener implements ApplicationListener {
	//接受到消息，回调该方法
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("TulingApplicationListener 接受到了一个事件"+event);
		System.out.println("事件内容：" + event.getSource());
	}
}
