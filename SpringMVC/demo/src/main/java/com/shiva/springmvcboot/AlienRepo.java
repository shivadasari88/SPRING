package com.shiva.springmvcboot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.springmvcboot.model.Alien;

public interface AlienRepo  extends JpaRepository<Alien, Integer>{

}
