package com.example.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Mapper.CarMapper;
import com.example.springboot.exception.RecordNotFoundException;
import com.example.springboot.model.Car;
import com.example.springboot.repositories.CarRepository;
import com.example.springboot.service.CarService;
import com.example.springboot.service.dto.CarDTO;
import com.example.springboot.service.dto.CarRequestDTO;

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

	@GetMapping("list")
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
	
	@PutMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public CarDTO update(@PathVariable Long id, CarDTO dto ) {
		
		return null;
	}

    @PutMapping("/users/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<CarDTO> updateCar(@PathVariable Long id, @RequestBody CarRequestDTO dto) {
        Car car = carRepository.findById(id).orElseThrow(() -> new RecordNotFoundException("Car not exist with id :" + id));
        car.setId(dto.id());
        car.setPlate(dto.plate());
        car.setColor(dto.color());
        Car carUpdate = carRepository.save(car);
        return ResponseEntity.ok(carMapper.toDTO(carUpdate));
    }












}
