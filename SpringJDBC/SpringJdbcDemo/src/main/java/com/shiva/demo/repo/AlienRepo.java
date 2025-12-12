package com.shiva.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shiva.demo.model.Alien;

@Repository
public class AlienRepo {
	public void save(Alien alien) {
		System.out.println("Added");
	}
	public List<Alien> findAll(){
		return new ArrayList<Alien>();
	}
}
