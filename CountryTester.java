package com.xworkz.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryTester {
public static void main(String[] args) {
	ApplicationContext contnr=new ClassPathXmlApplicationContext("fw/spring.xml");
	Country refofcountry=contnr.getBean(Country.class);
	refofcountry.getdetails();
}
}
