package com.client;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zh.facade.UserService;
import com.zh.pojo.po.User;

public class ClientMain {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"classpath*:spring/springmvc.xml"});
		UserService userService=(UserService) context.getBean("facadeService");
		List<User> sList = userService.getUsers();
		for (User user : sList) {
			System.out.println("用户："+user.getUsername());
		}
		context.start();
		System.in.read(); // 按任意键退出
	}
}
