package com.patel.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.patel.user.entity.User;
import com.patel.user.repository.UserRepository;
import com.patel.user.vo.Department;
import com.patel.user.vo.ResponseTemplateVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		 log.debug("inside saveUser() of UserService");
		return  userRepository.save(user);
	}

	public ResponseTemplateVo getUserWithDepartment(Long userId) {
		ResponseTemplateVo responseTemplateVo=new ResponseTemplateVo();
		User user=userRepository.findByUserId(userId);
		
		Department department=restTemplate.
				getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getUserId(),Department.class);
		
		responseTemplateVo.setDepartment(department);
		responseTemplateVo.setUser(user);
		return responseTemplateVo;
	}

}
