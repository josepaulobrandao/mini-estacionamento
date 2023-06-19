package com.example.springboot.model;

public class Vacancy {
    private Long id;
    private Integer number;
    private String reoad;

    public Vacancy(Long id, Integer number, String reoad) {
        this.id = id;
        this.number = number;
        this.reoad = reoad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getReoad() {
        return reoad;
    }

    public void setReoad(String reoad) {
        this.reoad = reoad;
    }
}
