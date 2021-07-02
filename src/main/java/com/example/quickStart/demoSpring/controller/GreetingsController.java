package com.example.quickStart.demoSpring.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.quickStart.demoSpring.Greetings;


//This is how someone would interact with our API this is their main entry point
@RestController
public class GreetingsController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	// /greeting?name=Dan -> Hello Dan!
	@GetMapping("/greeting")
	public Greetings greeting(@RequestParam(value = "name", 
											defaultValue = "World") String name) {
		return new Greetings(counter.incrementAndGet(), String.format(template, name));
	}
}
