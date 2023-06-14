package com.example.springboot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.springboot.dtos.dtoimpl.CarImplRecordDTO;
import com.example.springboot.model.Car;
import com.example.springboot.repositories.CarRepository;

@Service
public class CarService {

	private CarRepository carRepository;

	@Autowired
	public CarService(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	public List<CarImplRecordDTO> carListAll() {
	    List<Car> carList = carRepository.findAll();

	    ModelMapper modelMapper = new ModelMapper();
	    List<CarImplRecordDTO> carImplRecordDTOList = 
	    carList.stream()
	            .map(car -> modelMapper.map(car, CarImplRecordDTO.class))
	            .collect(Collectors.toList());
	    return carImplRecordDTOList;
	}

	public ResponseEntity<CarImplRecordDTO> createModel(CarRepository repository) {
		Car car = new CarImplRecordDTO();
		Car savedCar = repository.save(car);
		return ResponseEntity.ok(savedCar);
		return repository.save(carRecordRepositoryImpl);
	}

}
