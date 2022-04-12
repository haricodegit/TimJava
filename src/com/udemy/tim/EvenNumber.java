package com.udemy.tim;

public class EvenNumber {
	static int even = 0, odd = 0;
	public static void main(String[] args) {
		isEvenNumber(4,20);
	}
	public static void isEvenNumber(int n, int f) {
		while (n <= f) {
			n++;
			if((n % 2) == 0) {
				System.out.println(n +" true");
				even++;
			} 
			else {
				System.out.println(n +" false");
				odd++;
			}
		}
		System.out.println("Even "+even);
		System.out.println("Odd "+odd);
	}
}