package com.xworkz.event;

public class Country {
private String primeMinister;
private String president;
private String capital;
private double population;
private int noOfStates;
public Country(String primeMinister) {
	super();
	this.primeMinister = primeMinister;
}

public void setPresident(String president) {
	this.president = president;
}
public void setCapital(String capital) {
	this.capital = capital;
}
public void setPopulation(double population) {
	this.population = population;
}
public void setNoOfStates(int noOfStates) {
	this.noOfStates = noOfStates;
}
void getdetails() {
	System.out.println(primeMinister+" "+president+"   "+capital+" "+population+" "+noOfStates);
}

}