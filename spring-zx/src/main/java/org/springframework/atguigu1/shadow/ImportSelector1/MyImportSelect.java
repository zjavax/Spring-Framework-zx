package org.springframework.atguigu1.shadow.ImportSelector1;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

// refresh方法是用来初始化容器上下文的。跟着这个调用链走下来到中间有一个类是ConfigurationClassPostProcessor，
// 根据类名我们就可以猜到这个类应该是处理配置类（也就是标注@Configuration）的。
public class MyImportSelect implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{Y1.class.getName()};
	}
}
