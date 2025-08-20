package app.labs.ex03.di02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomerMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:config/di02/application-config.xml");
		 
		Customer customer = context.getBean("customer", Customer.class);
		Customer customer1 = context.getBean("customer", Customer.class);
		System.out.println(customer);
		System.out.println(customer == customer1);			// true
		
	
		Person person1 = context.getBean(Person.class);
		Person person2 = context.getBean(Person.class);
		System.out.println(person1 == person2);				// false 객체 주소값 다름 - Prototype
		
		context.close();
	}
}
