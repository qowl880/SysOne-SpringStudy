package app.labs.ex04.aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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
	
//	public void exceptionLog(JoinPoint joinPoint,Exception exception) {
//		Signature signature = joinPoint.getSignature();
//		String methodName = signature.getName();
//		System.out.println(">>>EXCEPTION LOG<<< : 핵심코드 메서드명 - "+ methodName);
//		System.out.println("예외 발생 - 메시지  : "+ exception.toString());
//	}
	
	public Object aroundLog(ProceedingJoinPoint joinPoint) {
		Object result = null;
		Signature signature = joinPoint.getSignature();
		String methodName = signature.getName();
		System.out.println(">>> BEFORE LOG <<< : 메서드 이름 - " + methodName);
		try {
			result = joinPoint.proceed();		// 핵심코드 실행 
		}catch(Throwable e) {
			System.out.println(">>> EXCEPTION KOG <<< : 예외 메시지 - " +e.getMessage());
		}finally {
			System.out.println(">>> FINALLY<<<");
		}
		return result;
	}
}