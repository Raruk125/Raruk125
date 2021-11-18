package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Country;


public interface FaindRepository extends JpaRepository<Country,String> {
	List<Country>findByTairikuAndNameLike(String name,String tairiku);
}