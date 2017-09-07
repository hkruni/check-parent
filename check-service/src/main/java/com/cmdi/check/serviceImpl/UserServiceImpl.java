package com.cmdi.check.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmdi.check.dao.UserDAO;
import com.cmdi.check.model.User;
import com.cmdi.check.service.api.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired(required = true)
	private UserDAO userDAO;

	public List<User> getUser(String username) {

		List<User> list = userDAO.getUser();

		return list;
	}

	public List<User> getUserByName(String username) {
		List<User> user = userDAO.getUserByName(username);
		return user;
	}

	public User add(String username, String password) {
		User user = new User();
		
		user.setUsername(username);
		user.setPassword(password);


		userDAO.addUser(user);
		List<User> list = userDAO.getUser();
		User u = list.get(0);

		return u;
	}

}
