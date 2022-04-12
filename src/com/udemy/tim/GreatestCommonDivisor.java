package com.udemy.tim;

public class GreatestCommonDivisor {
	public static int getGreatestCommonDivisor(int first, int second) {
		int i;
		if((first < 10) || (second < 10)) {
			return -1;
		}

		for(i = first; i >= 1; i--) {
			if((first % i == 0) && (second % i == 0)) {
				break;
			}
		}
		return i;
	}
}