package com.udemy.tim;

public class DigitSum {
	public static void main(String[] args) {
		System.out.println(sumDigit(123));
	}
	private static int sumDigit(int number) {
		if(number < 10) {
			return -1;
		}
		int sum = 0;
		
		while(number > 0) {
			//extract least significant digit
			int digit = number % 10;
			sum += digit;
			//drop least significant digit
			number /= 10;
		}
		return sum;
	}
}