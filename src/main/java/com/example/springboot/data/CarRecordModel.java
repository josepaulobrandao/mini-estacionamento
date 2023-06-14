package com.example.springboot.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CAR_MODEL")
public record CarRecordModel(
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		Integer id,
		String manufacturer,
		String category
		
		) {

}
