package com.edureka.spring.helloworld;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		RegularEmployee regularEmployee = context.getBean("regularEmp", RegularEmployee.class);
		//Person person2 = context.getBean("person", Person.class);
		System.out.println("The salary of the Person is " + regularEmployee.getSalary());
		System.out.println("The name property derived from Super class is "+regularEmployee.getName());
		context.registerShutdownHook();
		//System.out.println(person == person2);
	}

}
