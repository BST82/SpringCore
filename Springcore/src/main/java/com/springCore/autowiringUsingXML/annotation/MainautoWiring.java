package com.springCore.autowiringUsingXML.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainautoWiring {

	public static void main(String[] args) {
		
		ApplicationContext c=new
				ClassPathXmlApplicationContext("com/springCore/autowiringUsingXML/annotation/autoXMLConfiguration.xml");
	
	
		Worker ww3=c.getBean("working",Worker.class);
		System.out.println(" using Constructor "+ww3);
		
		Worker2 www=c.getBean("working2",Worker2.class);
		System.out.println(" using with @Qualifier(\"ww2\") "+www);
	
	}

}
