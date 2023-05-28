package com.springCore.referenceObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext(
				"com/springCore/referenceObject/referenceConfiguration.xml");

		A a = (A) c.getBean("A_reference");
		System.out.println(a.getX());
		System.out.println(a.getB().getY());
		System.out.println(a);
	}

}
 