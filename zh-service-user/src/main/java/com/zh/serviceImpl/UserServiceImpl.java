package com.zh.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zh.facade.UserService;
import com.zh.mapper.UserMapper;
import com.zh.pojo.po.User;

@Service("facadeService")
public class UserServiceImpl implements UserService {

	@Autowired 
	private UserMapper userMapper;
	
	public List<User> getUsers() {
		List<User> us=this.userMapper.getUsers();
		return us;
	}

	public User getUserByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}


}
