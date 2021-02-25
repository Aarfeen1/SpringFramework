package com.xworkz.shop.tester;

import com.xworkz.shop.constants.Open;
import com.xworkz.shop.dao.ShopDAO;
import com.xworkz.shop.dao.ShopDAOImpl;
import com.xworkz.shop.dto.ShopDTO;

public class SaveTester {
public static void main(String[] args) {
	ShopDTO shopdata=new ShopDTO(1, "abc", "bangalore", "xyz", Open.True);
ShopDAO impl=new ShopDAOImpl();
impl.saveShop(shopdata);
}
}
