package com.spring.four;

public class HelloWorld {

	private String message;

	public void getMessage() {
		System.out.println("This is Message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// ��ʼ���ص�
	public void init() {
		System.out.println("Bean ��ʼ���ص� init����");
	}

	// ���ٻص�
	public void destroy() {
		System.out.println("Bean ���ٻص�  destroy����");
	}

}
