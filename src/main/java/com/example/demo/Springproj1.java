package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 
@RestController
public class Springproj1{
	@GetMapping("/spring") 
	public String Welcome(){ 
		return "Welcome String Boot!";
		} 
	}