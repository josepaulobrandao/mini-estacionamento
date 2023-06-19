package com.example.springboot.model;

import java.time.LocalDateTime;

public class vacancyMovement{
	private LocalDateTime occupationDate;
	private LocalDateTime occupationStartDdate;
	private LocalDateTime occupationEndDate;

	public vacancyMovement(LocalDateTime occupationDate, LocalDateTime occupationStartDdate, LocalDateTime occupationEndDate) {
		this.occupationDate = occupationDate;
		this.occupationStartDdate = occupationStartDdate;
		this.occupationEndDate = occupationEndDate;
	}

	public LocalDateTime getOccupationDate() {
		return occupationDate;
	}

	public void setOccupationDate(LocalDateTime occupationDate) {
		this.occupationDate = occupationDate;
	}

	public LocalDateTime getOccupationStartDdate() {
		return occupationStartDdate;
	}

	public void setOccupationStartDdate(LocalDateTime occupationStartDdate) {
		this.occupationStartDdate = occupationStartDdate;
	}

	public LocalDateTime getOccupationEndDate() {
		return occupationEndDate;
	}

	public void setOccupationEndDate(LocalDateTime occupationEndDate) {
		this.occupationEndDate = occupationEndDate;
	}
}




