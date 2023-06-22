package com.example.springboot.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;

public record CarRequestDTO(@JsonIgnoreProperties Long id, @NotBlank String plate, @NotBlank String color) {
}
