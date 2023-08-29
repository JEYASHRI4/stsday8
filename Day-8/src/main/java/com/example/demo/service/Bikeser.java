package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bike;

import com.example.demo.repository.Bikerepo;

@Service
public class Bikeser {
@Autowired
Bikerepo reb;
public Bike saveinfo (Bike ss){
	   return reb.save(ss);
}
public List<Bike> showinfo(){
	   return reb.findAll();
}
public Bike changeinfo(Bike s) {
	   return reb.saveAndFlush(s);
}
public void deleteinfo(Bike s) {
	   reb.delete(s);
}
public List<Bike> getbikeyear(int year){
	   return reb.getBikeinfoyear(year);
}
public List<Bike> getbikename(String s){
	   return reb.getBikename(s);
}
public List<Bike> getinfo(int id,String s){
	   return reb.getBikeinfo(id,s);
}
}
