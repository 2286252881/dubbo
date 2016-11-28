package com.zh.mapper;

import java.util.List;

import com.zh.pojo.po.User;

public interface UserMapper {
	List<User> getUsers();

	User getUserByPrimaryKey(String id);
}
