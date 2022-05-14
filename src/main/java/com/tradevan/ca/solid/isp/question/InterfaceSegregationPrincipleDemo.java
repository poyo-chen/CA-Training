package com.tradevan.ca.solid.isp.question;

public class InterfaceSegregationPrincipleDemo {

	// question: 利用 ISP 方法, 將 Vehicle 介面改成適合的設計方式, ex: 避免 car 會使用 fly 方法
	public static void main(String[] args) {

		DriveVehicle car = new Car();
		FlyVehicle plane = new Plane();
		SailVehicle boat = new Boat();
		
		car.drive();
		plane.fly();
		boat.sail();
	}

}
