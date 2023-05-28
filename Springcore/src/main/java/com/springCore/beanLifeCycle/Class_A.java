package com.springCore.beanLifeCycle;

public class Class_A {
	private double price;

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("step 1) setting price call");
		this.price = price;
	}

	public Class_A(double price) {
		super();
		this.price = price;
	}

	public Class_A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "step 3) Class_A [price=" + price + "]";
	}
	public void init() {
		System.out.println("step 2) Inside init method");
	}
	public void destroy() {
		System.out.println("step 4) Inside destroy method");
	}
	
}
