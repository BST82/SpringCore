package com.springCore.constructorInjection;

import java.util.Set;

public class Person {
private String name;
private int id;
private Certificate c;  // property
private Set<Integer>num;

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public Person(String name, int id, Certificate c, Set<Integer> num) {
	super();
	this.name = name;
	this.id = id;
	this.c = c;
	this.num = num;
}

@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", c=" + c + ", num=" + num + "]";
}


}
