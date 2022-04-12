package com.udemy.tim;

public class PrimeNumber {
	public static void main(String[] agrs) {
		for(int i = 1; i <= 20; i++) {
			System.out.println(isPrime(i));
		}
	}
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}