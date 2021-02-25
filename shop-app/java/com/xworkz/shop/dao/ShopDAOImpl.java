package com.xworkz.shop.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.shop.dto.ShopDTO;

public class ShopDAOImpl implements ShopDAO {

 	private SessionFactory factory;
	
	
	public SessionFactory getFactory() {
		return factory;
	}


	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}


	public void saveShop(ShopDTO shopDto) {
	
	try {
		//Configuration conn=new Configuration();
		//conn.configure();
	//SessionFactory	factory=conn.buildSessionFactory();
          Session  session=factory.openSession();
          session.beginTransaction();
          session.save(shopDto);
          session.getTransaction().commit();
	}
	catch(Exception e){
		
		e.printStackTrace();
		
	}
 
	   
	}

}
