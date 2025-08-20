package app.labs.ex03.di04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MemberMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 
		MemberController controller = context.getBean("memberController", MemberController.class);
		
		System.out.println(controller.info());
		
		context.close();
	}
}
