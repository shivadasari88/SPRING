package com.shiva.springmvcboot;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shiva.springmvcboot.model.Alien;


@Controller
public class HomeController {
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "shiva");
	} 
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i,  @RequestParam("num2") int j,ModelMap m) {
			
			int num3 = i+j;
			m.addAttribute("num3",num3);

		return "result";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		
		List<Alien> aliens = Arrays.asList(new Alien(101,"shiva"), new Alien(102, "rama"));
		
		m.addAttribute("result", aliens);
		return "showAliens";
	}
	
	//@RequestMapping("addAlien")
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a) {
		
		return "result";
	}
	
	
}
