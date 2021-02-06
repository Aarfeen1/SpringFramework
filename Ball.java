package com.xworkz.event;

public class Ball {
private String type;
private double weight;
private String usedFor;
public Ball(String type, double weight) {
	super();
	this.type = type;
	this.weight = weight;
}
public Ball( double weight,String type) {
	super();
	this.type = type;
	this.weight = weight;
}
public Ball( String type) {
	super();
	this.type = type;
	
	
}

public void setUsedFor(String usedFor) {
	this.usedFor = usedFor;
}
void getdetails() {
	System.out.println(type+" "+weight+" "+usedFor);
}

}
