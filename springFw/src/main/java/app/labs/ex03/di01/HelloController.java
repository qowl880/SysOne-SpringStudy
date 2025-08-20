package app.labs.ex03.di01;

import lombok.RequiredArgsConstructor;

// 의존성 생성 
public class HelloController {
	// 1. 기본 - 멤버필드 이용
//	private  IHelloService helloService = new HelloService();
	
	
	// 2.생성자 이용 	- 생산성 / 유연성 확보 
	private IHelloService helloService;
	
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	// 3. Setter 이용
	public HelloController() {}
	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	
	
	public void hello(String name) {
		System.out.println("HelloController : " + helloService.sayHello(name));
	}
	

}
