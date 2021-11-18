package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Comp;



public interface fukushuRepository extends JpaRepository<Comp,Integer> {
	List<Comp>findByCompnumberOrCompname(Integer compnumber,String compname);
}