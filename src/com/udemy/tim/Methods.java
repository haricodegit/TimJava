package com.udemy.tim;

public class Methods {
	public static void main(String[] args) {
		boolean gameOver = true;
		int finalScore = calculateScore(gameOver,1000,5,100,"First");
		System.out.println("Your First Game Final Score was: "+finalScore);
		finalScore = calculateScore(gameOver, 5000, 8, 200,"Second");
		System.out.println("Your Second Game Final Score was: "+finalScore);
		System.out.println("Function execution completed!");
	}
	//methods are created outside Main method, because main is also a method
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus, String strval) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			return finalScore;
		}
			return -1;
	}
}