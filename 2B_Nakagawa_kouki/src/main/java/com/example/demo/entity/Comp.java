package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comp")
public class Comp {
	@Id
	private Integer compnumber;
	
	@Column
	private String compname;

	public Integer getCompnumber() {
		return compnumber;
	}

	public void setCompnumber(Integer compnumber) {
		this.compnumber = compnumber;
	}

	public String getCompname() {
		return compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}
	

	
}