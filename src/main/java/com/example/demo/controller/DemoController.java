package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@PostMapping("/userName")
	public String getName()  
	{
		return "Akash...";
	}
	@GetMapping("/user")
	public String getId(@RequestParam(required = false)String id){
		List<String> a1=new ArrayList<>();
		a1.add("1");
		a1.add("2");
		a1.add("3");
		a1.add("4");
		a1.add("5");
		a1.add("6");
		a1.add("7");
		a1.add("8");
		a1.add("9");
		a1.add("10");
		if(id != null)
		{
			for(String s:a1)
			{
				if(s.equals(id))
					return s;
			}
			return " ";
		}
		return a1.toString();
	}
}
