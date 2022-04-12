package com.udemy.tim;

public class MethodOverload {
	public static void main(String[] args) {
		int newScore = calculateScore("Harish", 500);
		System.out.println("New Score: "+newScore);
		int newScore1 = calculateScore(newScore);
		System.out.println("New Score: "+newScore1);
		int newScore2 = calculateScore();
		System.out.println("New Score: "+newScore2);
	}
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player Name "+playerName+ " Scored "+score+ " points");
		return score * 100;
	}
	public static int calculateScore(int score) {
		System.out.println("Unknown player Name scored "+score+ " points");
		return score * 100;
	}
	public static int calculateScore() {
		System.out.println("Empty signature...");
		return -1;
	}
}