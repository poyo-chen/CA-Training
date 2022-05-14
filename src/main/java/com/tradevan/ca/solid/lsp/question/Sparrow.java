package com.tradevan.ca.solid.lsp.question;

public class Sparrow implements FlyBird {

	@Override
	public void fly() {
		System.out.println("Sparrow flies");
	}

	@Override
	public void eat() {
		System.out.println("Sparrow eats");
	}

}
