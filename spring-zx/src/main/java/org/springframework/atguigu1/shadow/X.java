//package org.springframework.atguigu1.shadow;
//
//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//@Component
//public class X implements InitializingBean, DisposableBean {
//
//    @Autowired
//    Y y;
//
//    public X(){
//        System.out.println("X create 张翔");
//    }
//
//    @PostConstruct  // 非侵入性
//    public void init() {
//		System.out.println("init");
//	}
//
//	public void query() {
//		System.out.println("query");
//	}
//
//	@Override  // 侵入性太强，需要实现spring的接口
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("afterPropertiesSet");
//	}
//
//	@Override  // 侵入性太强，需要实现spring的接口
//	public void destroy() throws Exception {
//		System.out.println("destroy");
//	}
//}
//
