package cn.zx;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SpringMailListener implements ApplicationListener<SpringMailEvent> {
	@Override
	public void onApplicationEvent(SpringMailEvent event) {
		System.out.println(event.getContent());
	}
}
