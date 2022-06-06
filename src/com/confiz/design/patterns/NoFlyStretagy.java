package com.confiz.design.patterns;

public class NoFlyStretagy implements IFlyStretagy{
	@Override
	public void fly() {
		System.out.println("This is duck cannot fly");
	}
}
