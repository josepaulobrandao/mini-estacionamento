package com.example.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_CAR")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String plate;
	private String color;
	
	public Car() {
	}
	public Car(Long id, String plate, String color) {
		super();
		this.id = id;
		this.plate = plate;
		this.color = color;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = this.id;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	
	
}
