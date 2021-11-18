package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	@Id
	private String name;
	
	@Column
	private String tairiku;
	
	@Column
	private Integer population;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTairiku() {
		return tairiku;
	}

	public void setTairiku(String tairiku) {
		this.tairiku = tairiku;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}	

}
