package com.udemy.tim;

public class SpeedConverter {
    
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
		double kilomertersPerHour = 0;
		double milesPerHour = Math.round(kilomertersPerHour * 0.6214);
        System.out.println(+kilomertersPerHour+ " km/h = " +milesPerHour+ " mi/h");
        }
    }
}