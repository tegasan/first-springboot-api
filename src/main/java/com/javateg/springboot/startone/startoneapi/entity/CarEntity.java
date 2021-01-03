package com.javateg.springboot.startone.startoneapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAR")
public class CarEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String brand;
	private String model;
	private String year;
	private String miles;
	private double price;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMiles() {
		return miles;
	}
	public void setMiles(String miles) {
		this.miles = miles;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CarEntity(String brand, String model, String year, String miles, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.miles = miles;
		this.price = price;
	}
	public CarEntity(Integer id, String brand, String model, String year, String miles, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.miles = miles;
		this.price = price;
	}
	public CarEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
