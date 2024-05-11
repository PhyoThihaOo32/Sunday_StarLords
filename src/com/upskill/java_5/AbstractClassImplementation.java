package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass{

	@Override
	public void iDoor() {
		System.out.println("My car has 4 door");
		
	}

	@Override
	public int iWheel() {
		System.out.println("My car has 4 wheel");
		return 4;
	}

	@Override
	public void iSeat() {
		System.out.println("My car has 4 seat");
		
	}

	@Override
	public String iColor() {
		System.out.println("My car is RED");
		return "RED";
	}
}