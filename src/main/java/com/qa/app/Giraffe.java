package com.qa.app;

public class Giraffe extends Animal implements Breathing, Furry{

	boolean longNecked;
	
	public void neck(boolean longNeck) {
		longNeck=longNecked;
		if(longNeck==true) {
			System.out.println("I have a long neck");
		}else{
			System.out.println("I don't have a long neck");
		}
	}

	public void breathesAir() {
		// TODO Auto-generated method stub
		System.out.println("breathes air");
	}

	public void fur() {
		// TODO Auto-generated method stub
		System.out.println("i dunno");
	}
	
	
}
