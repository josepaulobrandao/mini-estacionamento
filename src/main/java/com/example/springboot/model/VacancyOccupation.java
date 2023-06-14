package com.example.springboot.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class VacancyOccupation implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Double firstHourValue;
	private Double subsequentHourValue;
	
	public VacancyOccupation(Double firstHourValue, Double subsequentHourValue) {
		super();
		this.firstHourValue = firstHourValue;
		this.subsequentHourValue = subsequentHourValue;
	}
	
	public Double getFirstHourValue() {
		return firstHourValue;
	}
	public void setFirstHourValue(Double firstHourValue) {
		this.firstHourValue = firstHourValue;
	}
	public Double getSubsequentHourValue() {
		return subsequentHourValue;
	}
	public void setSubsequentHourValue(Double subsequentHourValue) {
		this.subsequentHourValue = subsequentHourValue;
	}
	
	public void  dateOfUsefullOccupation () {
		
	}

	public void saturdayOccupation () {
		
	}
}
