package cn.zx.ImportAware1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_ImportAware {
	// https://blog.csdn.net/Smallc0de/article/details/109319568
	public static void main(String[] args) {
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(AppConfig.class);
		DBConnection d = anno.getBean(DBConnection.class);
		System.out.println("name:" + d.getDbUser() + "; sqlUrl:" + d.getSqlUrl());
	}
}


