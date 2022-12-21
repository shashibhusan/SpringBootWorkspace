package com.dailycodebuffer.jwt.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        //Logic to get the user form the Database
    	if ("shashi".equals(userName))
    	{
    		return new User("admin","password",new ArrayList<>());
    	}else {
    		throw new UsernameNotFoundException("Invalid user");
    	}
        
    }
}
