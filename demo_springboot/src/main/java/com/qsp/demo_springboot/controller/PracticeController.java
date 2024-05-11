package com.qsp.demo_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.demo_springboot.dto.Fruit;

@RestController  
public class PracticeController {
	
	@GetMapping("/hi")
	public void demo() {
		System.out.println("Hello");
	}
	
	@GetMapping("/shubham")
	public String name() { 
		return("Hii I am shubh");
	} 
	
	@GetMapping("/demo")
	public void demo2() {
		System.out.println("HIIIIIIIIII");
	}
	
	
	@PostMapping("/fruit") 
	public void fruit(@RequestBody  Fruit fruit) {   //requestbody annotation used for unmarshalling
		
		System.out.println(fruit);
		
		}
	
	@PostMapping("/fruits") 
	public Fruit fruits (@RequestBody  Fruit fruits) {
		
		return(fruits); 
		
		}

}
 