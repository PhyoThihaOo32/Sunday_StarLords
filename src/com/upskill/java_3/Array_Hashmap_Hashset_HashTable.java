package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {

		//Array store multiple data using index
		int age = 25;											//Variable
		int[] ageHulk = new int[]{25, 30, 35, 38, 43, 28};		//Array

		//Array index			  [0] [1] [2] [3] [4] [5]
		
		System.out.println("Student Age : " + ageHulk[3]);
		System.out.println("Total Student : " + ageHulk.length);
		
		String[] nameHulk = new String[]{"Redwan", "Sana", "Sanam", "Muazzem", "Mamun"};		//Array
		System.out.println("Student Age : " + nameHulk[3]);
		System.out.println("Total Student : " + nameHulk.length);
		
		//Multi-Dimentional Array
		int [][] ageHulk2D = {{25, 30, 35, 38, 43, 28},			//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
							  {23, 32, 38, 27}};				//[1][0] [1][1] [1][2] [1][3]
		
		System.out.println("Student Age 2D : " + ageHulk2D[1][1]);
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Redwan", 27);
		Student.put("Sana", 31);
		Student.put("Sanam", 38);
		Student.put("Muazzem", 24);
		
		System.out.println("HashMap Student Age : "+ Student.get("Sana"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");		
		System.out.println("Capital City : " + Capital.get("BD"));
		
		//HashTable store multiple data using key-value pair, No duplicate, also is synchronized (only one thread can be modified)

		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("Region : " + Region.get("BD"));
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("Audi");
		car.add("BMW");
		car.add("Tesla");
		car.add("Range Rover");
		System.out.println("Car : " + car);
	}

}
