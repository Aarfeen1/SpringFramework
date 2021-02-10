package com.xworkz.relation;

public class SwitchBoard {
	private int noOfSwitches;
	private String brand;
	




	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setNoOfSwitches(int noOfSwitches) {
		this.noOfSwitches = noOfSwitches;
	}

	private Charger charger;
	

	public SwitchBoard(Charger charger) {
		
		super();
		this.charger = charger;
		System.out.println("created switchboard");
	}
	
	public void supplyPower() {
		
		System.out.println("started supplypower");
		System.out.println("noofswitches"+noOfSwitches);
		System.out.println("brand"+brand);
		System.out.println(brand.toUpperCase());
	 charger.charge();
	}

}
