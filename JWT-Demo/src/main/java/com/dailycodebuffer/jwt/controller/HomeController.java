package com.dailycodebuffer.jwt.controller;

import com.dailycodebuffer.jwt.model.JwtRequest;
import com.dailycodebuffer.jwt.model.JwtResponse;
import com.dailycodebuffer.jwt.service.UserService;
import com.dailycodebuffer.jwt.utility.JWTUtility;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private JWTUtility jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "Welcome to Daily Code Buffer!!";
    }

    @PostMapping("/authenticate")
    public  ResponseEntity<?> authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{

    	authenticate(jwtRequest.getUsername(), jwtRequest.getPassword() );

        final UserDetails userDetails
                = userService.loadUserByUsername(jwtRequest.getUsername());
        final String token =
                jwtUtility.generateToken(userDetails); 
        return ResponseEntity.ok(new JwtResponse(token));
    }
    
    private void authenticate(String username, String password) throws Exception {
		Objects.requireNonNull(username);
		Objects.requireNonNull(password);

		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			System.out.println("=======1111=======");
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			System.out.println("=======2222=======");
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}
