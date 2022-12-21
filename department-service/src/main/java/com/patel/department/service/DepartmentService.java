package com.patel.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patel.department.entity.Department;
import com.patel.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment() Department Service");
		return departmentRepository.save(department); 
	}
	
	public Department findByDepartmentId(Long departmentId)
	{
		log.info("Inside findByDepartmentId() Department Service");
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
}
