package org.springframework.atguigu1.config;

import org.springframework.atguigu1.component1.Component1;
import org.springframework.atguigu1.shadow.Configuration1.Y2;
import org.springframework.atguigu1.shadow.Configuration1.Y3;
import org.springframework.atguigu1.shadow.ImportSelector1.MyImportSelect;
import org.springframework.context.annotation.*;

@Configuration
//@Import(MyImportSelect.class)
//@Import(Component1.class)
@ComponentScan("org.springframework.atguigu1")
//@EnableAspectJAutoProxy(proxyTargetClass=true)  // 开启cglib代理
public class AppConfig {

//	@Bean
//	public Y2 getY2() {
//		return new Y2();
//	}
//
//	@Bean
//	public Y3 getY3() {
//		getY2();
//		return new Y3();
//	}
}
