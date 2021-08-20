package zx;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class SpringApplication1 {

	public static void run() {
		AnnotationConfigWebApplicationContext c = new AnnotationConfigWebApplicationContext();
		c.register(MyMVCConfig.class);
		c.refresh();

		DispatcherServlet d = new DispatcherServlet(c);

		// System.getproperty(“java.io.tmpdir”)是获取操作系统缓存的临时目录
		String property = System.getProperty("java.io.tmpdir");

		File base = new File(property);

		Tomcat tomcatServer = new Tomcat();
		tomcatServer.setPort(8082);




		try {
			tomcatServer.start();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}

		Context rootCtx = tomcatServer.addContext("/", base.getAbsolutePath());
		tomcatServer.addServlet(rootCtx, "zx", d).setLoadOnStartup(1);
		rootCtx.addServletMapping("/", "zx");

		System.out.println("tomcat启动...");

		tomcatServer.getServer().await();
	}
}
