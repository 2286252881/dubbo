package com.zh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zh.facade.UserService;
import com.zh.pojo.po.User;

@Controller
public class TestController {
	
	@Autowired
	private  UserService facadeService;
	
	@RequestMapping("/test")
	public @ResponseBody List<User> test() {
		
		List<User> sList = facadeService.getUsers();
		return sList;
	}
}
