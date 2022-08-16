package com.qa.app;

public class Frog extends Animal implements Breathing{

	int hopRange;
	
	public void howHigh() {
		System.out.println("I can hop "+ hopRange + " high");
	}

	public void breathesAir() {
		// TODO Auto-generated method stub
		System.out.println("breathes air and water");
	}
	
}
