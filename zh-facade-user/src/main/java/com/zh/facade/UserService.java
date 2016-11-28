package com.zh.facade;

import java.util.List;

import com.zh.pojo.po.User;

public interface UserService {
	List<User> getUsers();
	User getUserByPrimaryKey(String id);
}
