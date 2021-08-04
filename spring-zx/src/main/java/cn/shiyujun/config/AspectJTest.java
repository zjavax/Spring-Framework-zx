package cn.shiyujun.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectJTest {

    @Pointcut("execution(public * cn.shiyujun.service.IOCService.hello1(..))")
    public void testAOP(){}

//    @Before("testAOP()")
//    public void before(){
//        System.out.println("before testAOP...");
//    }
//
//    @After("testAOP()")
//    public void after(){
//        System.out.println("after testAOP...");
//    }
//
//    @Around("testAOP()")
//    public Object around(ProceedingJoinPoint p){
//        System.out.println("around before testAOP...");
//        Object o = null;
//        try {
//            o = p.proceed();
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
//        System.out.println("around after testAOP...");
//        return o;
//    }
//
//	@AfterReturning("testAOP()")
//	public void afterReturning() throws Throwable {
//		System.out.println("@AfterReturning通知!");
//	}

	// AspectJAfterThrowingAdvice竟然继承 AfterAdvice 接口而不是异常接口 ThrowsAdvice
	@AfterThrowing("testAOP()")
	public void afterThrowing() {
		System.out.println("@AfterThrowing通知!");
	}


}
