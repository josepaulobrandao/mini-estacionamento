package com.example.springboot.service.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;




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