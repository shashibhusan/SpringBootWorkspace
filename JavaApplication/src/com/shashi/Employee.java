package com.shashi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Employee {
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalTime getJoingingTime() {
		return joingingTime;
	}
	public void setJoingingTime(LocalTime joingingTime) {
		this.joingingTime = joingingTime;
	}

	public LocalDate getJoingingDate() {
		return joingingDate;
	}
	public void setJoingingDate(LocalDate joingingDate) {
		this.joingingDate = joingingDate;
	}

	public Employee(String empName, LocalTime joingingTime, String address, LocalDate joingingDate) {
		super();
		this.empName = empName;
		this.joingingTime = joingingTime;
		this.address = address;
		this.joingingDate = joingingDate;
	}

	private String empName;
	private LocalTime joingingTime;
	private String address;
	private LocalDate joingingDate;

}
