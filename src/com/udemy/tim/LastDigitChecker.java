package com.udemy.tim;

public class LastDigitChecker {
	public static boolean hasSameLastDigit(int n1, int n2, int n3) {		
			if(isValid(n1)	&& isValid(n2) && isValid(n3)) {
				n1 = n1 % 10;
				n2 = n2 % 10;
				n3 = n3 % 10;
				if((n1 == n2) || (n2 == n3) || (n3 == n1)) {
					return true;	
			}
		}
		return false;
	}
	
	public static boolean isValid(int n) {
		if(n >= 10 && n <= 1000) {
			return true;
		}
		return false;
	}
}