package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	
	@GetMapping(value="/inicio")
	public List<String> inicio(){
		List<String> lista = new ArrayList<String>();
		lista.add("CCCC");
		lista.add("DDDD");
		return lista;
	}
	
}
