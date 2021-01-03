package com.javateg.springboot.startone.startoneapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javateg.springboot.startone.startoneapi.entity.CarEntity;
import com.javateg.springboot.startone.startoneapi.model.CarRequestModel;
import com.javateg.springboot.startone.startoneapi.model.CarResponseModel;
import com.javateg.springboot.startone.startoneapi.model.GenericResponseModel;
import com.javateg.springboot.startone.startoneapi.service.StartOneService;

@RestController
public class StartOneController {

	@Autowired
	StartOneService startOneService;

	@GetMapping(path="/cars/{id}")
	@ResponseBody
	public Optional<CarEntity>  getCars(@PathVariable("id") Integer id) {
		Optional<CarEntity> carEntity = startOneService.getCar(id);
		return carEntity;
	}
	
	@PostMapping(path="/cars", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GenericResponseModel> addCar(@RequestBody CarRequestModel carRequestModel) {
		GenericResponseModel genericResponseModel = startOneService.addCar(carRequestModel);
		
		return new ResponseEntity<>(genericResponseModel, HttpStatus.OK);	
	}

	@PutMapping(path="/cars/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GenericResponseModel> updateCar(@PathVariable("id") Integer id, @RequestBody CarRequestModel carRequestModel) {
		GenericResponseModel genericResponseModel = startOneService.updateCar(id, carRequestModel);
		
		return new ResponseEntity<>(genericResponseModel, HttpStatus.OK);	
	}	
	
	@GetMapping(path="/cars")
	public ResponseEntity<CarResponseModel>  getCars() {
		CarResponseModel carResponseModel = startOneService.getCars();
		return new ResponseEntity<>(carResponseModel, HttpStatus.OK);
	}	
}
