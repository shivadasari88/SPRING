package com.shiva.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shiva.demo.model.Alien;
import com.shiva.demo.repo.AlienRepo;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
		
		Alien alien1 = context.getBean(Alien.class);
		
		alien1.setId(111);
		alien1.setName("shiva");
		alien1.setTech("java");
		
		AlienRepo repo  = context.getBean(AlienRepo.class);
			repo.save(alien1);
			
			System.out.println(repo.findAll());
		
	}

}
