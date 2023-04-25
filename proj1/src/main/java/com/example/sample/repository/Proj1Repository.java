package com.example.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.model.Proj1;

@Repository
public interface Proj1Repository extends JpaRepository<Proj1, Integer> {

}
