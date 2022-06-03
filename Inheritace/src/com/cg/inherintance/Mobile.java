package com.cg.inherintance;

public class Mobile {
private String manufacture;
private String operating_system;
protected String model;
private double cost;
public Mobile(String manufacture, String operating, String model, double cost) {
	super();
	this.manufacture = manufacture;
	this.operating_system = operating;
	this.model = model;
	this.cost = cost;
}
public String getModle() {
	return "This is Superclass method: "+ this.model;
}
@Override
public String toString() {
	return "Mobile [manufacture=" + manufacture + ", operating=" + operating_system + ", model=" + model + ", cost=" + cost
			+ "]";
}
}
