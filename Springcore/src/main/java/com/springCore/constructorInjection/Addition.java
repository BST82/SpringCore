package com.springCore.constructorInjection;

public class Addition {
private int a;
private int b;
public Addition(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("constructor int,int");
}
public Addition(String a, String b) {
	super();
	this.a = Integer.parseInt(a);
	this.b = Integer.parseInt(b);
	System.out.println("constructor String,String");
}

public Addition(double a, double b) {
	super();
	this.a = (int) a;
	this.b = (int) b;
	System.out.println("constructor double,double");
}
public Addition() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Addition = " + sum();
}

public int sum() {
	System.out.println("value of a = "+a);
	System.out.println("value of b = "+b);
	return a+b;
}

}
