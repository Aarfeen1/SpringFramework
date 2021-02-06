package com.xworkz.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BallTester {
	public static void main(String[] args) {
		ApplicationContext contnr=new ClassPathXmlApplicationContext("fw/spring.xml");
	Ball	refofball=contnr.getBean(Ball.class);
	refofball.getdetails();
	}

}
