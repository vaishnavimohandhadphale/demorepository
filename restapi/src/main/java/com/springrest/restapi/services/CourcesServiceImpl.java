package com.springrest.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.restapi.entities.Cources;

@Service
public class CourcesServiceImpl implements CourceService {

	List<Cources> list;
	
	
	
	public CourcesServiceImpl() {
		
		list=new ArrayList<>();
		
		list.add(new Cources(11 , "Java Core"));
		list.add(new Cources(33 , "Spring Boot"));
		list.add(new Cources(55 , "Python"));
		
		
	}



	@Override
	public List<Cources> getCources() {
		
		return list;
	}



	@Override
	public Cources getSingleCource(int id) {
		
		Cources c=null;
		for(Cources co:list)
		{
			if(co.id == id)
			{
				c=co;
				break;
			}
		}
		
		return c;
	}



	@Override
	public Cources addCource(Cources c) {
		list.add(c);
		return c;
	}

}
