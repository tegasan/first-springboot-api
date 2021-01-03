package com.javateg.springboot.startone.startoneapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javateg.springboot.startone.startoneapi.entity.CarEntity;
import com.javateg.springboot.startone.startoneapi.model.CarRequestModel;
import com.javateg.springboot.startone.startoneapi.model.CarResponseModel;
import com.javateg.springboot.startone.startoneapi.model.GenericResponseModel;
import com.javateg.springboot.startone.startoneapi.repository.CarRepository;

@Service
public class StartOneService {
	
	@Autowired
	CarRepository carRepository;
	
	public GenericResponseModel addCar(CarRequestModel carRequestModel) {
		GenericResponseModel genericResponseModel = new GenericResponseModel(); 
		//String brand, String model, String year, String miles, double price)
		CarEntity carEntity = new CarEntity(carRequestModel.getBrand(), carRequestModel.getModel(),
				carRequestModel.getYear(), carRequestModel.getMiles(), carRequestModel.getPrice());
		carRepository.save(carEntity);
		genericResponseModel.setDisplayMessage("success");
		genericResponseModel.setDescription("added car entity");
		return genericResponseModel;
	}

	public GenericResponseModel updateCar(Integer id, CarRequestModel carRequestModel) {
		Optional<CarEntity> listCarEntity = carRepository.findById(id);
		GenericResponseModel genericResponseModel = new GenericResponseModel(); 
		listCarEntity.get().setBrand(carRequestModel.getBrand());
		listCarEntity.get().setModel(carRequestModel.getModel());
		listCarEntity.get().setYear(carRequestModel.getYear());
		listCarEntity.get().setPrice(carRequestModel.getPrice());
		listCarEntity.get().setMiles(carRequestModel.getMiles());
		
		carRepository.save(listCarEntity.get());
		genericResponseModel.setDisplayMessage("success");
		genericResponseModel.setDescription("updated car entity");
		return genericResponseModel;
	}
	
	public Optional<CarEntity> getCar(Integer id) {
		//List<CarEntity> listCarEntity = new ArrayList<>();
		Optional<CarEntity> carEntity = carRepository.findById(id);
		return carEntity;
	}
	public CarResponseModel getCars() {
		CarResponseModel carResponseModel = new CarResponseModel();
	
		List<CarEntity> listCarEntity = new ArrayList<>();
		listCarEntity = carRepository.findAll();
		carResponseModel.setTotalCar(listCarEntity.size());
		carResponseModel.setListCar(listCarEntity);
		//System.out.println(carEntity.getBrand());

		return carResponseModel;	
	}
}
