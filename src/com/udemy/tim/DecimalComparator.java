package com.udemy.tim;

import java.text.DecimalFormat;
import java.math.RoundingMode;

public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.DOWN);
		
		String str1 = df.format(x);
		String str2 = df.format(y);
		
		float cf1 = Float.parseFloat(str1);
		float cf2 = Float.parseFloat(str2);
		System.out.println(cf1);
		System.out.println(cf2);
		if(cf1 == cf2) {
			return true;
		} else {
			return false;
		}
	}
}