package com.example.springboot.service.dto;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
=======
public record CarDTO (Long id, String plate, String color) {
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
public class CarDTO {
	
        private Long id;
        private String ticket;
        private @NotBlank String plate;
        private @NotBlank String color;
        private String manufacturer;
        private String category;
        @CreatedDate
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        private LocalDateTime dataCriacao = LocalDateTime.now();
          
        
  }