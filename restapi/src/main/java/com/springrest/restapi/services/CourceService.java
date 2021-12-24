package com.springrest.restapi.services;

import java.util.List;

import com.springrest.restapi.entities.Cources;

public interface CourceService {

	 List<Cources> getCources();
	
	 Cources getSingleCource(int id);
	
	 Cources addCource(Cources c);
}
