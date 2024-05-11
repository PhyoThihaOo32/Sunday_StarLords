package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";			//Write & Read
	private int ssn = 45875126;					//write only
	private String username = "raselualam";		//read only
	
	//Setter Method - name						//set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name						//get the data, Read
	public String getName(){
		return name;
	}
	
	//Setter Method - ssn						//Set the data, write
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method  - username					//get the data, read
	public String getUserName(){
		return username;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		
//		obj.setName("Muazzem");
		
		System.out.println(obj.getName());
		
		obj.setSSN(999999);
		
		System.out.println(obj.getUserName());
	}
}