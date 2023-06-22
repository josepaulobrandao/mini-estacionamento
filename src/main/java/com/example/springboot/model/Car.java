package com.example.springboot.model;

import jakarta.persistence.*;

@Entity
public class Car  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String plate;
	private String color;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "carm_category")
	private CarModel carModel;
	public Car() {

	}

	public Car(Long id, String plate, String color) {
		super();
		this.id = id;
		this.plate = plate;
		this.color = color;

	}

	public Car(Long id, String plate, String color, CarModel carModel) {
		this.id = id;
		this.plate = plate;
		this.color = color;
		this.carModel = carModel;
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

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}


}
