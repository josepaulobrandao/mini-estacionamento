package com.example.springboot.model;

public abstract class Car  {
	private Integer id;
	private String plate;
	private String color;
	
	public Car() {
		
	}
	
	public Car(Integer id, String plate, String color) {
		this.plate = plate;
		this.color = color;
		this.id = id;
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

	public Integer getId() {
		return id;
	}

}
