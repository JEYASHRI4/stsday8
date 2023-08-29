package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.model.Bike;

public interface Bikerepo extends JpaRepository<Bike, Integer> {

	@Query(value = "select * from Bikeinfo where year=:ns",nativeQuery = true)
	public List<Bike> getBikeinfoyear(@Param("ns") int year);
	@Query(value = "select * from Bikeinfo where year=:ns or bikename=:s",nativeQuery = true)
	public List<Bike> getBikeinfo(@Param("ns") int year,@Param("s") String bikename);
	@Query(value = "select * from Bikeinfo where bikename=:s",nativeQuery = true)
	public List<Bike> getBikename(@Param("s") String bikename);
	
}
