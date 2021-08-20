//package zx;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//// https://blog.csdn.net/u012702547/article/details/53674867
//// SpringMVC基础配置(通过注解配置,非xml配置)
//public class WebInitializer implements WebApplicationInitializer {
//    public void onStartup(ServletContext servletContext) throws ServletException {
////        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
////        ctx.register(MyMVCConfig.class);
////        ctx.setServletContext(servletContext);
////        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
////        servlet.addMapping("/");
////        servlet.setLoadOnStartup(1);
//		System.out.println("==========================");
//    }
//}
