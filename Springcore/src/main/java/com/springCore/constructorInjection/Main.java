package com.springCore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext c= new ClassPathXmlApplicationContext("com/springCore/constructorInjection/constructorInjectionConfiguration.xml");
	 Person p=(Person)c.getBean("person");
	 System.out.println(p);
	 
	 Addition a= (Addition)c.getBean("add");
	 System.out.println(a.toString());
	
	}

}
