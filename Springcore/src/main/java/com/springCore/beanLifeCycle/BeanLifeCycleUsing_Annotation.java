package com.springCore.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycleUsing_Annotation {
private String nName;

public String getnName() {
	return nName;
}

public void setnName(String nName) {
	this.nName = nName;
}

public BeanLifeCycleUsing_Annotation(String nName) {
	super();
	this.nName = nName;
}

public BeanLifeCycleUsing_Annotation() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "BeanLifeCycleUsing_Annotation [nName=" + nName + "]";
}

@PostConstruct
public void init() {
	System.out.println("init method");
}

@PreDestroy
public void destroyee() {
	System.out.println("destroye method");
}
}
