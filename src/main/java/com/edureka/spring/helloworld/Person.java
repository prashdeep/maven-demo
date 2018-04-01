package com.edureka.spring.helloworld;

public class Person {
	
	private String name;
	
	private double salary;
	
	private String greetMessage;
	
	public Person(String greetMessage) {
		this.greetMessage = greetMessage;
	}

	public void myInitMethod() {
		System.out.println("********* Inside the init method of Person************");
	}
	
	public void myCustomDestroyMethod() {
		System.out.println("******Inside my cusomt destroy method*****");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setGreetMessage(String greetMessage) {
		this.greetMessage = greetMessage;
	}


	public String getGreetMessage() {
		return this.greetMessage;
	}
}
