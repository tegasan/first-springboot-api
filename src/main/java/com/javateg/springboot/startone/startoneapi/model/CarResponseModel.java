package com.javateg.springboot.startone.startoneapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.javateg.springboot.startone.startoneapi.entity.CarEntity;
import lombok.Data;

@Data
public class CarResponseModel {
		
	private int totalCar;
	@JsonProperty("cars")
	private List<CarEntity> listCar;
	public int getTotalCar() {
		return totalCar;
	}
	public void setTotalCar(int totalCar) {
		this.totalCar = totalCar;
	}
	public List<CarEntity> getListCar() {
		return listCar;
	}
	public void setListCar(List<CarEntity> listCar) {
		this.listCar = listCar;
	}
	
}
