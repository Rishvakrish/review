package com.example.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.model.Proj1;
import com.example.sample.repository.Proj1Repository;

@Service
public class Proj1Service  {
	@Autowired
	Proj1Repository Lap;
	
	public List<Proj1> getDetails(){
		return Lap.findAll();
	}
	
	public Proj1 saveDetails(Proj1 N) {
		return Lap.save(N);
	}
}
