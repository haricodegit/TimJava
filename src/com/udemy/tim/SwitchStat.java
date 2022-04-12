package com.udemy.tim;

public class SwitchStat {
	public static void main(String[] args) {
		String switchValue = "APR";		
		switch(switchValue.toLowerCase()) {
		case "jan": case "feb": case "mar": case "apr":
			System.out.println(switchValue+ " was found");
			break;
		default:
			System.out.println(switchValue+ " Value was not found!");
		}
	}
}