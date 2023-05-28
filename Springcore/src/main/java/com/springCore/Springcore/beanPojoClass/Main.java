package com.springCore.Springcore.beanPojoClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext(
				"com/springCore/Springcore/beanPojoClass/studentConfiguration.xml");

		Student s = (Student) c.getBean("stu");
		System.out.println(s);

		Student s2 = (Student) c.getBean("stu2");
		System.out.println(s2);

		Student s3 = (Student) c.getBean("stu3");
		System.out.println(s3);

		Student s4 = (Student) c.getBean("stu4");
		System.out.println(s4);
	}

}
