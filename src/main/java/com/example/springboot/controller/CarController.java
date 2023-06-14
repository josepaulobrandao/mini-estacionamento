package com.example.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Car;

@RestController
@RequestMapping("/api/v1")
public class CarController {

	@GetMapping
	public List<Car> findAll() {
		return null;
	}
}
