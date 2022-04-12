package com.udemy.tim;

public class TeenNumberChecker {
	public static boolean hasTeen(int t1, int t2, int t3) {
		if((t1 >= 13 && t1 <= 19) || (t2 >= 13 && t2 <= 19) || (t3 >= 13 && t3 <= 19)) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean isTeen(int t4) {
		if(t4 >= 13 && t4 <= 19) {
			return true;
		} else {
			return false;
		}
	}
}