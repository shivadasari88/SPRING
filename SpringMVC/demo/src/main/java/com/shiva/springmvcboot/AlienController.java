package com.shiva.springmvcboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shiva.springmvcboot.model.Alien;


@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	@GetMapping("aliens")
	@ResponseBody
	public List<Alien> getAliens() {
		List<Alien> aliens = repo.findAll();
		return aliens;
	}
}
