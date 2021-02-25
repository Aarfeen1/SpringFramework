package com.xworkz.shop.tester;

import java.util.Arrays;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.xworkz.shop.constants.Open;
import com.xworkz.shop.dao.ShopDAO;
import com.xworkz.shop.dto.ShopDTO;

public class SpringTester {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("fw/spring.xml");
	SessionFactory factory=context.getBean(SessionFactory.class);
	System.out.println(factory);
	 System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	 ShopDTO shopdto=new ShopDTO("deep", "btm layout", "rahul", Open.valueOf("False"));
 ShopDAO     impl=context.getBean(ShopDAO.class);
 impl.saveShop(shopdto);


}
}