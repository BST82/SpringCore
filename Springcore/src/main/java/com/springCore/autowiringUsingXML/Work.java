package com.springCore.autowiringUsingXML;

public class Work {
private String name;
private String city;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Work [name=" + name + ", city=" + city + "]";
}


}
