package com.springCore.autowiringUsingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainautoWiring {

	public static void main(String[] args) {
		
		ApplicationContext c=new
				ClassPathXmlApplicationContext("com/springCore/autowiringUsingXML/autoXMLConfiguration.xml");
	
		Worker ww=c.getBean("worker",Worker.class);
		System.out.println(" byName "+ww);
		
		Worker ww2=c.getBean("work",Worker.class);
		System.out.println(" byType "+ww2);
	
		Worker ww3=c.getBean("working",Worker.class);
		System.out.println(" using Constructor "+ww3);
	
	}

}
