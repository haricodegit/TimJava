package com.udemy.tim;

/*Re-cap of primitive data types in java
 * byte
 * short
 * int
 * long
 * float
 * double
 * char
 * boolean*/

public class Strings {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myString = "This is myString";
		System.out.println("myString is equal to: "+myString);
		myString = myString + ", adding more string";
		System.out.println("myLatestString is equal to: "+myString);
		myString = myString + " \u00A9 2021";
		System.out.println("Copyrights: "+myString);
		String numberString = "205.05";
		numberString = numberString + " 406.56";
		System.out.println("Number String output: "+numberString);
		String myLastString = "10";
		int myInt = 50;
		myLastString = myLastString + myInt;
		System.out.println("addition of String + Int is: "+myLastString);
		double doubleNumber = 420.45d;
		myLastString = myLastString + doubleNumber;
		System.out.println("addition of String + int + double: " +myLastString);
		
		int result = 1;
		result += 2;
		System.out.println("result: " + result);
		
		//result = result * 10
		result *= 10;
		System.out.println("result: " +result);
		
		//result = result / 10
		result /= 3;
		System.out.println("result: " +result);
		
		//result = result - 2
		result -= 2;
		System.out.println("result: "+result);
		
		boolean isAlien = true;
		if (isAlien != false) {
			System.out.println("It is not an Alien");
			System.out.println("I am not scared of Alien");
		}
		else
		{
			System.out.println("It is an Alien");
			System.out.println("Yes Yes");
		}
		
		int topscore = 80;
		if (topscore < 100) {
			System.out.println("you have got highest score!");
			
		int secondtopscore = 81;
		if ((topscore > secondtopscore) && (topscore < 100)) {
			System.out.println("Greater than second top score and less than 100");
		}
		}
		
		int topScore = 90, secondTopScore = 100;
		if ((topScore > 90) || (secondTopScore <=90)) {
			System.out.println("Either or both the condtions are true");
		}
		
		int newInt = 50;
		if (newInt == 50) {
			System.out.println("This is true!");
		}
		boolean isCar = true;
		if (isCar) {
			System.out.println("True");
		}
			else
		{
				System.out.println("False");
		}
		//Ternary operator
		isCar = false;
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		}
			
		
		
		
		
		
		
		
		
		
		
	}
}