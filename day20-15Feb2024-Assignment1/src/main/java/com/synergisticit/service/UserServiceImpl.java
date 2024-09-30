package com.synergisticit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergisticit.domain.User;
import com.synergisticit.repository.UserRepository;
import com.synergisticit.service.UserService;

@Service (value = "userService")
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void save(User user) {
		userRepository.save(user);		
	}

	@Override
	public User findById(Long id) {
		Optional<User> optUser = userRepository.findById(id);
		
		if(optUser.isPresent())
		    return optUser.get();
		else
			return null;
	}
	
	@Override
	public List<User> findAll(){
		return userRepository.findAll();
	}

	@Override
	public void update(User user) {
		User saveUser = userRepository.save(user);
		System.out.println("saveUser: "+saveUser);
	}

	@Override
	public void deleteById(Long id) {
		userRepository.deleteById(id);	
	}

}
