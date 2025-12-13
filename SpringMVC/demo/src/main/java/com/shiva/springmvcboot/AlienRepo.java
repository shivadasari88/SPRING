package com.shiva.springmvcboot;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.springmvcboot.model.Alien;

public interface AlienRepo  extends JpaRepository<Alien, Integer>{

	List<Alien> findByAname(String aname);

}
