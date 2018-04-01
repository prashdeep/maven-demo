package com.edureka.spring.helloworld;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyCustomBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String arg1) throws BeansException {
		System.out.println("Called inside the BeanPostProcessorAfterInitialization");
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException {
		System.out.println("Called inside the BeanPostProcessorBefore Initialization");
		return bean;
	}

}
