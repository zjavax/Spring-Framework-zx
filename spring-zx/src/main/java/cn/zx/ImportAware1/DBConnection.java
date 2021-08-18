package cn.zx.ImportAware1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

// 新版代码 import直接导入不行 ，需要配置 Configuration 注解
// 好像是特意改的，不是很懂，需要你特意加上 @Configuration
@Configuration
public class DBConnection implements ImportAware {
	private String sqlUrl; //假设存的连接信息
	private String dbUser; //假设存的用户名
	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		//可以拿到已给注解上所有注解的属性值，并放到一个map中
		Map<String, Object> map = importMetadata.getAnnotationAttributes(EnableMetadata.class.getName());
		//从map中拿到注解的所有属性信息
		AnnotationAttributes attrs = AnnotationAttributes.fromMap(map);
		//取出注解中的值，并给全局变量赋值
		this.sqlUrl=attrs.get("dbUrl").toString();
		this.dbUser=attrs.get("dbUser").toString();
	}
	public String getDbUser() {
		return dbUser;
	}
	public String getSqlUrl() {
		return sqlUrl;
	}
}

