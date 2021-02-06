package com.xworkz.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {
	public static void main(String[] args) {
	String metainfo="fw/spring.xml";
	ApplicationContext spring=new ClassPathXmlApplicationContext(metainfo);
Event event=spring.getBean("event",Event.class);
event.manage();
spring.getBean("event1",Event.class);
int count=spring.getBeanDefinitionCount();
System.out.println(count);

	}

}
