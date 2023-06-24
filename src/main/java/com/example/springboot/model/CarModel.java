package com.example.springboot.model;

import jakarta.persistence.*;
@Entity
public class CarModel {
    @Id
    private Long id;
    private String manufacturer;
    private String category;

    public CarModel(String manufacturer, String category, Car car) {
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public CarModel(Long id, String manufacturer, String category) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
