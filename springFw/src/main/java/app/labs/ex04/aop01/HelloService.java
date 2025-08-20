package app.labs.ex04.aop01;

public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		System.out.println("HelloService.sayHello() 메서드 실행");
	
		// 1) 코드
	 // System.out.println(">>> log :" + new java.util.Date());		
		
		// 2) OOP(객체 지향) -> 코드 분류 후 분리(공통 코드) - 재활용 
//		HelloLog.log();
		
		// 3) Proxy 구현 - HelloServiceProxy 생성 
		String message = "Hello~~~~" + name;
			
		return message;
	}

	
	@Override
	public String sayGoodBye(String name) {
		String message = "GoodBye~~~~" + name;
		
		return message;
	}

}
