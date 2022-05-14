package com.tradevan.ca.solid.isp.question;

public class Car implements DriveVehicle {

	@Override
	public void drive() {
		System.out.println("Car drives");
	}

//	@Override
//	public void fly() {
//		throw new UnsupportedOperationException();
//	}
//
//	@Override
//	public void sail() {
//		throw new UnsupportedOperationException();
//	}

}
