package com.cmdi.check.service.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cmdi.check.model.User;

public interface IUserService {
	

	public List<User> getUser(String username);

	public List<User> getUserByName(String username);

	public User add(String username, String password);

}
