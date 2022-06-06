package com.confiz.design.patterns;

public class ToyDuck extends Duck {

	public ToyDuck(IFlyStretagy fly) {
		super(fly);
	}

	public void display() {
		System.out.println("This is a Toy Duck");
	}
}
