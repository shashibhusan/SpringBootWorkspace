package com.patel.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallbackMethod()
	{
		return "User service is not reachable.Please try later";
	}
	
	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallbackMethod()
	{
		return "Department service is not reachable.Please try later";
	}

}
