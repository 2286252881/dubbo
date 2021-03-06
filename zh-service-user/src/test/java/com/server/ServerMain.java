package com.server;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerMain {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"classpath*:spring/spring-context.xml"});
		context.start();
		System.in.read(); // 按任意键退出
	}
}
