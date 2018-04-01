package com.edureka.spring.helloworld;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Person person = context.getBean("person", Person.class);
		//Person person2 = context.getBean("person", Person.class);
		System.out.println("The greet message is "+person.getGreetMessage());
		System.out.println("The name of the Person is "+person.getName());
		System.out.println("The salary of the Person is " + person.getSalary());
		context.registerShutdownHook();
		//System.out.println(person == person2);
	}
}
