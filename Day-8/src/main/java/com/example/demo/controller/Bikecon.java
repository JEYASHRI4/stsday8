package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bike;
import com.example.demo.service.Bikeser;

@RestController
public class Bikecon {
@Autowired
Bikeser bser;
@PostMapping("addbike")
public Bike add(@RequestBody Bike ss) {
	return bser.saveinfo(ss);
 }
@GetMapping("showbike")
public List<Bike> show(){
	return bser.showinfo();
}
@PutMapping("updatebike")
public Bike modify(@RequestBody Bike s) {
	return bser.changeinfo(s);
}
@DeleteMapping("del")
public String delinfo(@RequestBody Bike s) {
	 bser.deleteinfo(s);
	 return "Deleted successfully";
}
@GetMapping("showqueryyear/{year}")
public List<Bike> getstu(@PathVariable int year){
	return bser.getbikeyear(year);
}
@GetMapping("showqueryname/{name}")
public List<Bike> getstu(@PathVariable String name){
	return bser.getbikename(name);
}
@GetMapping("showquery/{year}/{name}")
public List<Bike> getstu(@PathVariable int year,@PathVariable String name){
	return bser.getinfo(year, name);
}
}
