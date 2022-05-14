package com.tradevan.ca.solid.isp.question;

public class Boat implements SailVehicle {

//	@Override
//	public void drive() {
//		throw new UnsupportedOperationException();
//
//	}
//
//	@Override
//	public void fly() {
//		throw new UnsupportedOperationException();
//	}

	@Override
	public void sail() {
		System.out.println("Boat sails");
	}

}
