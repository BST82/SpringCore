package com.springCore.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext c = new ClassPathXmlApplicationContext(
				"com/springCore/beanLifeCycle/classAConfiguration.xml");
//		Class_A a = (Class_A) c.getBean("A");
//
//		System.out.println(a);

		// registeringShutDown method for call destroy method
		c.registerShutdownHook();

		/*
		 * using implementing Interfaces init() and destroy() method
		 */

		
//		BeanLifeCycleUsingInterface b = (BeanLifeCycleUsingInterface) c.getBean("usingInterface");
//
//		System.out.println(b);
		
		BeanLifeCycleUsing_Annotation ano = (BeanLifeCycleUsing_Annotation) c.getBean("usingAnnotation");

		System.out.println(ano);

	}

}
