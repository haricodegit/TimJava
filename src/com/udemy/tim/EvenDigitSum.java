package com.udemy.tim;

public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		int sum = 0, n = 0;
		if(number < 0) {
			return -1;
		}
		while(number > 0) {
			n = number % 10;
			if(n % 2 == 0) {
				sum += n;
			}
			number = number / 10;
		}
		return sum;
	}
}