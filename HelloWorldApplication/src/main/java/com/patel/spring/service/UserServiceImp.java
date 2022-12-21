package com.patel.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patel.spring.Bean.User;
import com.patel.spring.repository.UserRepository;

@Service
@Transactional
public class UserServiceImp implements UserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public void createUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public List<User> getUser() {
		 return (List<User>) userRepository.findAll();
	}

	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User user, long l) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(long id) {
		 userRepository.deleteById(id);
		
	}

	@Override
	public User updatePartially(User user, long id) {
		User usr = findById(id);
        usr.setCountry(user.getCountry());
        return userRepository.save(usr);
	}

}
