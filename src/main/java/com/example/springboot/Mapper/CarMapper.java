package com.example.springboot.Mapper;

import com.example.springboot.model.Car;
import com.example.springboot.service.dto.CarDTO;
import com.example.springboot.service.dto.CarRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class CarMapper {

    public CarDTO toDTO(Car car) {
        return new CarDTO(car.getId(), car.getPlate(), car.getColor());
    }

    public Car toModel (CarRequestDTO carDTO){
            Car car = new Car();
            car.setId(carDTO.id());
            car.setPlate(carDTO.plate());
            car.setColor(carDTO.color());
            return  car;
    }


}
