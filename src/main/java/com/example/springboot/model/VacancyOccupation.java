package com.example.springboot.model;

public class VacancyOccupation {

    private Long id;
    private Double firstHourValue;
    private Double subsequentHourValue;

    public VacancyOccupation(Long id, Double firstHourValue, Double subsequentHourValue) {
        this.id = id;
        this.firstHourValue = firstHourValue;
        this.subsequentHourValue = subsequentHourValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}