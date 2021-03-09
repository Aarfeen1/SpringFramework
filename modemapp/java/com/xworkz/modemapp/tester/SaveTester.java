package com.xworkz.modemapp.tester;

import com.xworkz.modemapp.dao.ModemDao;
import com.xworkz.modemapp.dao.ModemDaoImp;
import com.xworkz.modemapp.dto.ModemDTO;

public class SaveTester {
	public static void main(String[] args) {
		ModemDTO modemDTO=new ModemDTO(2,"cisco","wireless");
		ModemDao dao=new ModemDaoImp();
		dao.saveModemm(modemDTO);
	}

}
