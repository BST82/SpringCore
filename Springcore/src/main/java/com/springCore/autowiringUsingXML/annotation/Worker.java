package com.springCore.autowiringUsingXML.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Worker {
	
@Autowired
private Work w;

public Work getW() {
	return w;
}

// @Autowired 
public void setW(Work w) {
	this.w = w;
	
	System.out.println("setter method call");
}
// @Autowired
public Worker(Work w) {
	super();
	this.w = w;
	System.out.println("by constructor ");
}

public Worker() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Worker Details "+this.w;
}


}
