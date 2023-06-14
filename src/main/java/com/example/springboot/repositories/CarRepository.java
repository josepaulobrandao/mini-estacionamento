package com.example.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.dtos.CarRecordDTO;
import com.example.springboot.dtos.dtoimpl.CarImplRecordDTO;
import com.example.springboot.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	List<CarRecordDTO> saveAll(CarImplRecordDTO carImpl);

}
