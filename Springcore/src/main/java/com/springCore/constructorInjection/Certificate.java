package com.springCore.constructorInjection;

public class Certificate {

	public String cName;
	public int cId;
	public Certificate(String cName, int cId) {
		super();
		this.cName = cName;
		this.cId = cId;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Certificate [cName=" + cName + ", cId=" + cId + "]";
	}
	
	
}
