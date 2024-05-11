package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
/* 	Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
		
		car();
		car("Red");
		car("Red", 4);
		car(7);
	}
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	public void annualIncomeVoid(){
		int rentalIncome = 25000;
		int cripto = 20000;
		int business = 25000;
		int calculateAnnualIncome = hourlyIncome * 2000 + rentalIncome + cripto + business;
		System.out.println(" My Annual Income = " + calculateAnnualIncome);
	}
	

	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("My car is Tesla");
	}

	public static void car(String color){
		System.out.println("My car is Tesla, color is " + color);
	}

	public static void car(String color, int door){
		System.out.println("My car is Tesla, color is " + color + ", it has door " + door);
	}
	
	public static void car(int seat){
		System.out.println("My car is Tesla, seat is " + seat);
	}
}
