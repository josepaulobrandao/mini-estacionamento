package com.example.springboot.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class CarModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String manufacturer;
	private String category;
	
	public CarModel(String manufacturer, String category) {
		super();
		this.manufacturer = manufacturer;
		this.category = category;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
