package com.xworkz.event;

public class Projector {
private int life;
private boolean hd;
private  double maxDisatnce;
private double cost;
public Projector(int life, boolean hd, double maxDisatnce) {
	super();
	this.life = life;
	this.hd = hd;
	this.maxDisatnce = maxDisatnce;
}

public void setCost(double cost) {
	this.cost = cost;
}
public void getdetails() {
	System.out.println(life+" "+hd+" "+maxDisatnce+" "+cost);
}
}
