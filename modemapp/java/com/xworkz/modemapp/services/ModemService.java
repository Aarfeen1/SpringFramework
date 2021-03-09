package com.xworkz.modemapp.services;

import org.springframework.stereotype.Component;

import com.xworkz.modemapp.dto.ModemDTO;
@Component
public interface ModemService {

	boolean validation(ModemDTO  modemDTO);
	
	
}
