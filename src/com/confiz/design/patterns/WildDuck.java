package com.confiz.design.patterns;

public class WildDuck extends Duck {

	public WildDuck(IFlyStretagy fly) {
		super(fly);
	}

	public void display() {
		System.out.println("This is a Wild Duck");
	}
}
