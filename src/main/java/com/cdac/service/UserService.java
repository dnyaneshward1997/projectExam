package com.cdac.service;

import com.cdac.entity.ContactUs;
import com.cdac.entity.User;

public interface UserService {

	User register(User user);

	ContactUs contactUs(ContactUs c);

}
