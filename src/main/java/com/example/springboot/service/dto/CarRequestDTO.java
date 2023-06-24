package com.example.springboot.service.dto;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import com.example.springboot.service.business.Ticket;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarRequestDTO {
	
        private Long id;
        private Ticket ticket;
        private @NotBlank String plate;
        private @NotBlank String color;
        private String manufacturer;
        private String category;
        @CreatedDate
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        private LocalDateTime dataCriacao = LocalDateTime.now();
          
       
        
  }