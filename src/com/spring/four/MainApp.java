package com.spring.four;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// �ڳ�ʼ��ǰ�ͳ�ʼ����ʵ��

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("postposition");
		obj.getMessage();
		context.registerShutdownHook();

	}

}
