package com.xworkz.modemapp.dao;

import org.springframework.stereotype.Component;

import com.xworkz.modemapp.dto.ModemDTO;
@Component
public interface ModemDao {
void saveModemm(ModemDTO modemDTO);

}
