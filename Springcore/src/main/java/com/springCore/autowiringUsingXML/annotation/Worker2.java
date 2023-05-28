package com.springCore.autowiringUsingXML.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Worker2 {

	@Autowired
	@Qualifier("ww2")
	private Work ww;

	public Work getWw() {
		return ww;
	}

	public void setWw(Work ww) {
		this.ww = ww;
	}

	public Worker2(Work ww) {
		super();
		this.ww = ww;
	}

	public Worker2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Worker2 [ww=" + ww + "]";
	}

	
	
}
