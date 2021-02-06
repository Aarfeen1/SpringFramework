package com.xworkz.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProjectorTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("fw/spring.xml");
	 Projector   refofprjctr=	container.getBean(Projector.class);
	 refofprjctr.getdetails();

	}

}
