package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.ContactUs;
import com.cdac.entity.User;
import com.cdac.repository.ContactUsRepository;
import com.cdac.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ContactUsRepository contactUsRepo;
	
	@Override
	public User register(User user) {
		return this.userRepo.save(user);
	}

	@Override
	public ContactUs contactUs(ContactUs c) {
		return this.contactUsRepo.save(c);
	}
}
