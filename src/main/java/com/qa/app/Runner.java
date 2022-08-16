package com.qa.app;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal();
		a.updateVariables(2, "niko", "mammal");
		a.eat();
		a.run();
		
		Giraffe g = new Giraffe();
		g.neck(true);
		g.fur();
		g.breathesAir();
		
		
	}

}
