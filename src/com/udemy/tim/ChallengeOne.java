package com.udemy.tim;

public class ChallengeOne {
	public static void main(String[] args) {
		double myFirstValue = 20.00d;
		double mySecondValue = 80.00d;
		double myValuesTotal = (myFirstValue  + mySecondValue) * 100;
		System.out.println("myValueTotal: " +myValuesTotal);
		double theRemainder = myValuesTotal % 40.00d;
		System.out.println("theRemainder: "+ theRemainder);
		boolean isNoRemainder = (theRemainder == 0) ? true : false;
		System.out.println("isNoRemainder: "+ isNoRemainder);
		if (!isNoRemainder) {
			System.out.println("Got some Remainder!");
		}
	}
}