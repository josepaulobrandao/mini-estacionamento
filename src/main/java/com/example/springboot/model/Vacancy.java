package com.example.springboot.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "TB_VACANCY")
public class Vacancy implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer number;
	private String reoad;
	public Vacancy(Integer number, String reoad) {
		super();
		this.number = number;
		this.reoad = reoad;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getReoad() {
		return reoad;
	}
	public void setReoad(String reoad) {
		this.reoad = reoad;
	}
	
	
	
	
}
