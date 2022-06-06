package com.confiz.design.patterns;

public class Duck {
	IFlyStretagy flyStretagy;
	
	public Duck(IFlyStretagy fly) {
		this.flyStretagy = fly;
	}
	
	public void quack() {
		System.out.println("Quack Quack...");
	}
	
	public void display() {
		System.out.println("This is a Duck");
	}
}
