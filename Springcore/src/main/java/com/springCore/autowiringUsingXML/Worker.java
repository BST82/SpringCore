package com.springCore.autowiringUsingXML;

public class Worker {
private Work w;

public Work getW() {
	return w;
}

public void setW(Work w) {
	this.w = w;
	
	System.out.println("setter method call");
}

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
