package com.patel.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.patel.spring.Bean.User;
import com.patel.spring.service.UserService;

@RestController
@RequestMapping(value={"/user"})
public class UserController {
	@Autowired
	UserService userService;
	
	 @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
	        System.out.println("Fetching User with id " + id);
	        User user = userService.findById(id);
	        if (user == null) {
	            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<User>(user, HttpStatus.OK);
	    }
	 
	 @PostMapping(value="/create",headers="Accept=application/json")
	    public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder){
	        System.out.println("Creating User "+user.getName());
	        userService.createUser(user);
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
	 
	 @GetMapping(value="/get", headers="Accept=application/json")
	    public List<User> getAllUser() {
		 System.out.println("This is all user method()");
	        List<User> tasks=userService.getUser();
	        return tasks;

	    }
	 

}
