package com.example.springboot.service.dto;

<<<<<<< HEAD
import java.time.LocalDateTime;
=======
import com.example.springboot.model.CarModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
>>>>>>> 7a05fe391fd540edabef1c292d7939ef72991cf7

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