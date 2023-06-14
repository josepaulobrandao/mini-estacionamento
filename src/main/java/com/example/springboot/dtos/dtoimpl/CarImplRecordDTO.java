package com.example.springboot.dtos.dtoimpl;

import com.example.springboot.model.Car;

import lombok.Data;

@Data
public class CarImplRecordDTO extends Car {
	private Integer id;
	private String plate;
	private String color;

}