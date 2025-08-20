package app.labs.ex03.di01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		// 1) 
//		HelloController helloController = new HelloController();
		
		// 2) 생성자를 이용한 방법
//		HelloController helloController = new HelloController(new HelloServiceTest());
		
		
		// 3) Setter 사용
//		HelloController helloController = new HelloController();
//		
//		helloController.setHelloService(new HelloService());
		
//		helloController.hello("홍길동");
		
		// 4) Spring DI (config 폴더를 Bean으로 설정하여 사용) 
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:config/di01/application-config.xml");
 
		
		// 5) 생성자
		HelloController controller = context.getBean("helloController", HelloController.class);
		controller.hello("홍길동");
		
		
		// 6) Setter
		HelloController controller2 = context.getBean("helloController2", HelloController.class);
		controller2.hello("홍길동");
		
		
		HelloController controller3 = context.getBean("helloController3", HelloController.class);
		controller3.hello("홍길동");
		
		
		context.close();
		
		
	}

}
