package com.cmdi.check.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cmdi.check.model.User;


public interface UserDAO {

	public List<User> getUser();

	public List<User> getUserByName(@Param(value = "username") String username);

	public int addUser(User user);
}