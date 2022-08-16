package com.qa.app;

public class Animal {

	int age;//0
	String name;//null
	String type;//null
	
	public void eat() {
		System.out.println("eat");
	}
	
	public void run() {
		System.out.println("run");
	}
	
	public void updateVariables(int a, String n, String t) {
		age=a;
		name=n;
		type=t;
		System.out.println(age+", "+name+", "+type);
	}
	
}
