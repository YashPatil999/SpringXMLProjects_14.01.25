package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Register;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

		Register rs = context.getBean("user1", Register.class);
		Register rs1 = context.getBean("user2", Register.class);
		System.out.println(rs);
		System.out.println(rs1);
	}
}
