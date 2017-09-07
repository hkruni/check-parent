package com.cmdi.check.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmdi.check.service.api.IUserService;

@Controller
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	@ResponseBody
	public  Map addUser(@RequestParam("username")String username,@RequestParam("password")String password){
		
		userService.add(username, password);
		Map map = new HashMap();
		map.put("status", "ok");
		
		return map;
		
	}
}
