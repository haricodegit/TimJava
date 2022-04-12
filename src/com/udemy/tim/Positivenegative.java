package com.udemy.tim;

public class Positivenegative {
	public static void main(String[] agrs) {
		checkNumber(1);
		checkNumber(-1);
		checkNumber(0);
	}
	public static void checkNumber(int number) {
		if(number > 0) {
			System.out.println("positive");
		} else if(number < 0) {
			System.out.println("negative");
		} else if(number == 0) {
			System.out.println("zero");
		}
	}
}