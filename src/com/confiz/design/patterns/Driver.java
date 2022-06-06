package com.confiz.design.patterns;

public class Driver {

	public static void main(String... ars) {

		System.out.println("<====================>");
		System.out.println("  Stretagy Pattern");
		System.out.println("<====================>");

		Duck cityDuck = new CityDuck(new SimpleFlyStretagy());
		cityDuck.quack();
		cityDuck.display();
		cityDuck.flyStretagy.fly();

		System.out.println();
		System.out.println("<==========================================================>");

		Duck wildDuck = new WildDuck(new SimpleFlyStretagy());
		wildDuck.quack();
		wildDuck.display();
		wildDuck.flyStretagy.fly();

		System.out.println();
		System.out.println("<==========================================================>");

		Duck toyDuck = new ToyDuck(new NoFlyStretagy());
		toyDuck.quack();
		toyDuck.display();
		toyDuck.flyStretagy.fly();

		System.out.println();
		System.out.println("<==========================================================>");

	}

}
