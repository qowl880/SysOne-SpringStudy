package app.labs.ex03.di03;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// 의존성 생성 
@Controller
public class HelloController {
	// 1. 기본
	@Autowired
	private IHelloService helloService;
	
	// IHelloService를 상속받아 사용하는 클래스가 2개 이상일때는 default Id값 (niceService)를 통해 구분이 가능함!!! 정리!! 실무에서 사용은 절대 금지 
//	@Autowired
//	private IHelloService niceService;
	
//	@Autowired
//	@Qualifier("niceService")			// 위의 내용을 방지하고자 사용하는 것이 @Qualifier 이다.
//	private IHelloService helloService;

	
	// 2.생성자 이용 	- 생산성 / 유연성 확보 
	// private final IHelloService helloService;
//	@Autowired
//	public HelloController(IHelloService helloService) {
//		this.helloService = helloService;
//	}
	//@Autowired
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	// 3. Setter 이용
	public HelloController() {}
	//@Autowired
	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	
	public void hello(String name) {
		System.out.println("HelloController : " + helloService.sayHello(name));
	}
	

}
