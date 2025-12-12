package com.shiva;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResources {
	
	@Autowired
	PersonRepository repo;
	
	@GetMapping("persons")
	public List<Person> getPersons(){
		List<Person> persons = (List<Person>) repo.findAll();
		
		
		
		return persons;
	}
}
