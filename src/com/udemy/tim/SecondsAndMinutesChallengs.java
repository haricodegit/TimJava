package com.udemy.tim;

public class SecondsAndMinutesChallengs {
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";
	
	public static void main(String[] args) {
		System.out.println(getDurationString((3909L)));	
	}
	private static String getDurationString(long min, long sec) {
		if((min < 0) || (sec < 0) || (sec > 59)) {
			return INVALID_VALUE_MESSAGE;
		}
		long hours = min / 60;
		long remainingMinutes = min % 60;

		String hoursString = hours + "h";
		if(hours < 10) {
			hoursString = "0" + hoursString;
		}
		String minuiteString = remainingMinutes + "m";
		if(remainingMinutes < 10) {
			minuiteString = "0" + minuiteString;
		}

		String SecondsString = sec + "s";
		if(sec < 10) {
			SecondsString = "0" + SecondsString;
		}
		return hoursString + " " +minuiteString+ " " +SecondsString+ " ";
	}
	private static String getDurationString(long sec) {
		if(sec < 0) {
			return INVALID_VALUE_MESSAGE;
		}
		long minutes = sec / 60;
		long remainingMinutes = sec % 60;
		return getDurationString(minutes, remainingMinutes);
	}
}