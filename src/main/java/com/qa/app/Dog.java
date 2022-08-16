package com.qa.app;

public class Dog extends Animal implements Furry{

	boolean isSpotted;
	
	public boolean spotted(boolean isSpot) {
		isSpot=isSpotted;
		if(isSpot==true) {
			System.out.println("I am spotted");
			return true;
		}else{
			System.out.println("I am not spotted");
			return false;
		}
	}

	public void fur() {
		// TODO Auto-generated method stub
		System.out.println("is furry, coat varies");
	}
	
}
