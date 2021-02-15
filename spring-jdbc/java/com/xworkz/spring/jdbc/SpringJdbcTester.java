package com.xworkz.spring.jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.ConnectionProperties;

public class SpringJdbcTester {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context=new ClassPathXmlApplicationContext("fw/SpringJdbc.xml");
	//	DriverManagerDataSource dm=new DriverManagerDataSource();
		//dm.
	DriverManagerDataSource  container=context.getBean(DriverManagerDataSource.class);
	System.out.println(container);
System.out.println(container.getConnection());
	}

}
