package com.sprinCore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext c= 
				new ClassPathXmlApplicationContext("com/sprinCore/standalone/collection/singletonConfig.xml");
	
	
	 LinkedListOrListPerson p= c.getBean("person",LinkedListOrListPerson.class);
	 System.out.println(p.getFriends().getClass().getName());
	 System.out.println(p);
	 
	 
	 System.out.println("-------------------------------------");
	 
	 
	 MapFeeStructure m= c.getBean("fee",MapFeeStructure.class);
	 System.out.println(m);
	 
	 System.out.println("-------------------------------------");
	 System.out.println(m.getProper());
	}


}