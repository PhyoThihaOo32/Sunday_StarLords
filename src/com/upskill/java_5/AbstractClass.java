package com.upskill.java_5;

public abstract class AbstractClass {
	
	public void car(){
		System.out.println("My car is Tesla");
	}
	
	public void Door(){
		System.out.println("My car has 4 door");
	}
	
	public abstract void iDoor();
	
	public abstract int iWheel();
	
	public abstract void iSeat();
	
	public abstract String iColor();
}