package com.springCore.collectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext(
				"com/springCore/collectionType/employeeConfiguration.xml");

		Employee e = (Employee) c.getBean("employee");
		System.out.println(e.getName());
		System.out.println(e.getPhone());
		System.out.println(e.getCourse());
		System.out.println(e.getAddress());
		
	}

}
