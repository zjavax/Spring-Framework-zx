package cn.zx.ImportAware1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.zx.ImportAware1")
@EnableMetadata(dbUrl = "sqlUrl",dbUser = "username") //写入需要的值进入方法
public class AppConfig {
}

