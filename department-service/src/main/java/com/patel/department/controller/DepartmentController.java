package com.patel.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patel.department.entity.Department;
import com.patel.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department)
	{
		log.info("Inside departmentService() of  department controller");
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/{id}")
	public Department findByDepartmentId(@PathVariable("id") Long departmentId)
	{
		log.info("Inside findByDepartmentId() of Department controller");
		return departmentService.findByDepartmentId(departmentId);
	}
	
	
}
