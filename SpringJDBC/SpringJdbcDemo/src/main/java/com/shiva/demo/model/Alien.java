package com.shiva.demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component   // to take care of the obj creating and distroying of the object to the spring

@Scope("prototype") //bydefault it is a singleton bean so itcan create only one object and it is .
					//but prototype scopes we create multiple objects.
public class Alien {

	
	private int id;
	private String name;
	private String tech;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	
}
