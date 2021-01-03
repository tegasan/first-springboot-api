package com.javateg.springboot.startone.startoneapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javateg.springboot.startone.startoneapi.entity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Integer> {

}
