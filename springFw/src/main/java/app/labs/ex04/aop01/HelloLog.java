package app.labs.ex04.aop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class HelloLog {

	// class Method 
	public static void log() {
		System.out.println(">>> log :" + new java.util.Date());	
	}
	
	
	public void resultLog(JoinPoint joinPoint,Object resultObj) {
		Signature signature = joinPoint.getSignature();
		String methodName = signature.getName();
		System.out.println(">>>RESULT LOG<<< : 핵심코드 메서드명 - "+ methodName);
		System.out.println("핵심코드의 반환 값 : "+ resultObj.toString());
	}
	
	public void exceptionLog(JoinPoint joinPoint,Exception exception) {
		Signature signature = joinPoint.getSignature();
		String methodName = signature.getName();
		System.out.println(">>>EXCEPTION LOG<<< : 핵심코드 메서드명 - "+ methodName);
		System.out.println("예외 발생 - 메시지  : "+ exception.toString());
	}
}