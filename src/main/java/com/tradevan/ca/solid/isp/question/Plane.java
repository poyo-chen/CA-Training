package com.tradevan.ca.solid.isp.question;

public class Plane implements FlyVehicle, DriveVehicle {

    @Override
    public void drive() {
        System.out.println("Plane drives");
    }

    @Override
    public void fly() {
        System.out.println("Plane flies");
    }

//	@Override
//	public void sail() {
//		throw new UnsupportedOperationException();
//	}

}
