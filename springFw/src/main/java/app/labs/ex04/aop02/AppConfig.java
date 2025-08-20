package app.labs.ex04.aop02;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.labs.ex03.di04.MemberService;
import app.labs.ex03.di04.MemberServiceImpl;

@Configuration
@Configurable		// AOP를 위한 추가
@ComponentScan(basePackages = {"app.labs.ex04.aop02"})
public class AppConfig {
	@Bean
	MemberServiceImpl memberService() {
		return new MemberService();
	}
}
