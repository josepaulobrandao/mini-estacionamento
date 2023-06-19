package com.example.springboot.controller;

import java.util.List;

import com.example.springboot.Mapper.CarMapper;
import com.example.springboot.exception.BusinessException;
import com.example.springboot.exception.RecordNotFoundException;
import com.example.springboot.repositories.CarRepository;
import com.example.springboot.service.CarService;
import com.example.springboot.service.dto.CarDTO;
import com.example.springboot.service.dto.CarRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {

	private final CarRepository carRepository;
	private final CarMapper carMapper;
	private final CarService carService;

	public CarController(CarRepository carRepository, CarMapper carMapper, CarService carService) {
		this.carRepository = carRepository;
		this.carMapper = carMapper;
		this.carService = carService;
	}

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<CarDTO> findAll () {
		return carService.list();
	}

	@GetMapping("{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public CarDTO findById (@PathVariable Long id) {
		return carService.getById(id);
	}

	@PostMapping("create")
	@ResponseStatus(code = HttpStatus.CREATED)
	public CarDTO create(@RequestBody CarRequestDTO carDTO) {
		return carService.create(carDTO);
	}













}
