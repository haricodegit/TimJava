package com.udemy.tim;

public class FirstLastDigitSum {
	public static int sumFirstAndLastDigit(int number) {
		
		if(number < 0) {
			return -1;
		}
		
		int firstDigit = 0, lastDigit = 0, reverse = 0;
		lastDigit = number % 10;
		
		while(number > 0) {
			firstDigit = number % 10;
			if(number != 0) {
				reverse = reverse * 10;
				reverse += lastDigit;
				number = number / 10;
			}
		}
		return lastDigit + firstDigit;
	}
}