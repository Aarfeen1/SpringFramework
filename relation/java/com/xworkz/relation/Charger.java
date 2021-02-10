package com.xworkz.relation;

public class Charger {
	private int noOfPins;
	
	public void setNoOfPins(int noOfPins) {
		this.noOfPins = noOfPins;
	}
	public Charger() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	public void charge() {
		System.out.println("started charge");
		System.out.println(noOfPins);
	}

}
