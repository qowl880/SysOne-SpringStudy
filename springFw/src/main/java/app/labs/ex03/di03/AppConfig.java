package app.labs.ex03.di03;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.labs.ex03.di03.HelloService;
import app.labs.ex03.di03.IHelloService;

@Configuration
@Configurable		// AOP를 위한 추가
@ComponentScan(basePackages = {"app.labs.ex03.di03"})
public class AppConfig {
	@Bean
	IHelloService helloService() {
		return new HelloService();
	}
}
