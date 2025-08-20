package app.labs.ex04.aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LogAspect {
	
	// 핵심 코드 
	@Pointcut(value="execution(* app.labs.ex04..HelloService.sayHello(..))")
	private void helloPointCut() {}
	
	@Pointcut(value="execution(* app.labs.ex04..HelloService.sayGoodBye(..))")
	private void goodByePointcut() {}
	
	// 공통코드 (Aspect + Advice) : Advisor
	@Before("helloPointCut()")		// Advice
	public void beforeLog(JoinPoint joinPoint) {			// Aspect
		 System.out.println(">>>log :" + new java.util.Date());
	}
	
	@AfterReturning(pointcut="goodByePointcut()", returning = "msg")
	public void afterLog(JoinPoint joinpoint, Object msg) {
		System.out.println(">>> Log:" +new java.util.Date());
		System.out.println(">>> msg:" + msg.toString());
	}
}
