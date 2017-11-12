package com.example.fakeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@CrossOrigin
	public Iterable<UserDetails> getAll(Pageable pageable) {
		return userRepo.findAll(pageable);
	}
	
}
