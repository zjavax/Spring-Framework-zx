package cn.zx.ImportAware1;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(DBConnection.class)  //导入连接类
public @interface EnableMetadata {  //注解开关
	String dbUrl() default "";
	String dbUser() default "";
}

