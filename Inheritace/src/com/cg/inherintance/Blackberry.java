package com.cg.inherintance;

public class Blackberry extends Mobile {
public Blackberry (String manufacturer, String operating_system, String model, double cost) {
	super (manufacturer,operating_system,model,cost);
	

	
}
public String getModle() {
	return "this is Superclass method: "+ this.model;
}
}

