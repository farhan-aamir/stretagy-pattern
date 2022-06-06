package com.confiz.design.patterns;

public class CityDuck extends Duck {

	public CityDuck(IFlyStretagy fly) {
		super(fly);
	}

	public void display() {
		System.out.println("This is a CIty Duck");
	}
}
