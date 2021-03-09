package com.xworkz.modemapp.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.modemapp.dto.ModemDTO;
import com.xworkz.modemapp.services.ModemService;

public class SpringTester {
	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
ModemService	modemservice=context.getBean(ModemService.class);
modemservice.validation(new ModemDTO(7,"samsung","wireless"));
	
	}
}