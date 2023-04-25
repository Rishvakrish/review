package com.example.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.model.Proj1;

import com.example.sample.repository.Proj1Repository;
import com.example.sample.service.Proj1Service;

@RestController
public class Proj1Controller {
	@Autowired
     Proj1Service re;
	@Autowired
     Proj1Repository Lap;
     
     @GetMapping(value="/rish")
     public List<Proj1> getDetails(){
    	 return re.getDetails();
     }
     @PostMapping(value="/sa")
     public String saveRing(@RequestBody Proj1 i)
     {
     	Lap.save(i);
     	return "saved";
     }
     @PutMapping(value="/thit")
     public String updateById(@RequestBody Proj1 co)
     {
     	Lap.save(co);
     	return "updated";
     }
     @DeleteMapping(value="/round/{z}")
     public String deleteById(@PathVariable int z)
     {
     	Lap.deleteById(z);
     	return "deleted";
     }
}
