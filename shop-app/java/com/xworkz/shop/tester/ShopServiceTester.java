package com.xworkz.shop.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.shop.constants.Open;
import com.xworkz.shop.dto.ShopDTO;
import com.xworkz.shop.services.ShopService;

public class ShopServiceTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("fw/spring.xml");
		
ShopService   service= container.getBean(ShopService.class);
service.validation(new ShopDTO("biryani", "micolayout", "rahmat", Open.valueOf("True")));
	}

}
