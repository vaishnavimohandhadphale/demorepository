package com.springrest.restapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.restapi.entities.Cources;
import com.springrest.restapi.services.CourceService;

@RestController
public class MyController {

	@Autowired
	private CourceService cs;
	
	@GetMapping("/home")
	public String thisIsHome()
	{
		return"Home Page";
	}
	
	@GetMapping("/cources")
	public List<Cources> getCources()
	{
		return this.cs.getCources();
	}
	
	@GetMapping("/cource/{id}")
	public Cources singleCource(@PathVariable int id)
	{
		return this.cs.getSingleCource( id);
	}
	
	@PostMapping("/add")
	public Cources addCource(@RequestBody Cources co)
	{
		return this.cs.addCource(co);
	}
}
