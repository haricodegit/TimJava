package com.udemy.tim;

public class NumberPalindrome {

	public static boolean isPalindrome(int number) {

		int reverse = 0, lastDigit = 0, n = number;

		while(Math.abs(number) > 0) {
			lastDigit = number % 10;
			System.out.println("lastDigit "+lastDigit);
			reverse = reverse * 10;
			System.out.println("reverse "+reverse);
			reverse += lastDigit;
			System.out.println("reverse1 "+reverse);
			number = number / 10;
			System.out.println("number "+number);
		}
		if(reverse == n) {
			return true;
		}
		return false;
	}
}