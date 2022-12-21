package com.patel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	
	@RequestMapping(value ="/")
	public String hello()
	{
		return "1st STS application";
	}

}
