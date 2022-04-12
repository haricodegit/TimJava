package com.udemy.tim;

public class Intrest {
	public static void main(String[] args) {
		for(int i = 2; i <=8; i++) {
			System.out.println("10,000 at " +i+ "% intrest = " + String.format("%.2f", calculateIntrest(10000, i)));
		}
		System.out.println();
		for(int i = 8; i >=2; i--) {
			System.out.println("10,000 at " +i+ "% intrest = " + String.format("%.2f", calculateIntrest(10000, i)));
		}
	}
	public static double calculateIntrest(double amount, double intrest) {
		return (amount * (intrest/100));
	}
}