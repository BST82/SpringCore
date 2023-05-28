package com.springCore.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleUsingInterface implements InitializingBean,DisposableBean{

	private int count;
	
	@Override
	public String toString() {
		return "BeanLifeCycleUsingInterface [count=" + count + "]";
	}

	public BeanLifeCycleUsingInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanLifeCycleUsingInterface(int count) {
		super();
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is Destroy() method )");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is Init() method but method name is afterPropertiesSet()");
	}

}
