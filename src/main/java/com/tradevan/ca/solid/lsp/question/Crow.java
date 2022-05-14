package com.tradevan.ca.solid.lsp.question;

public class Crow implements FlyBird {

	@Override
	public void fly() {
		System.out.println("Crow flies");
	}

	@Override
	public void eat() {
		System.out.println("Crow eats");
	}

}
