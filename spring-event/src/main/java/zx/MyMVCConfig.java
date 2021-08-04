package zx;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableWebMvc
@ComponentScan("zx")
public class MyMVCConfig {
//    @Bean
//    public InternalResourceViewResolver viewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        //前缀
//        viewResolver.setPrefix("/WEB-INF/classes/views/");
//        //后缀
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setViewClass(JstlView.class);
//        return viewResolver;
//    }
}
