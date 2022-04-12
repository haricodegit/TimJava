package com.udemy.tim;

public class Displayhighscoreposition {
	public static void main(String[] args) {
		int position = calculateHighScorePosition(1500);
		displayHighScorePosition("Harish", position);
		
		position = calculateHighScorePosition(999);
		displayHighScorePosition("Tim", position);
		
		position = calculateHighScorePosition(499);
		displayHighScorePosition("Julie", position);
		
		position = calculateHighScorePosition(50);
		displayHighScorePosition("John", position);
		}
	public static void displayHighScorePosition(String playerName, int position) {
		System.out.println("Player Name: "+playerName+ ", managed to get into position "+position+ " on the high score table.");
	}

	public static int calculateHighScorePosition(int position) {
		/*
		 * if(position >= 1000) { return 1; } //else if(position >= 500 && position <
		 * 1000) { else if(position >= 500) { return 2; } //else if(position >= 100 &&
		 * position < 500) { else if(position >= 100) { return 3; } return 4;
		 */
		if(position >= 1000) {
			position = 1;
		} else if(position >= 500) {
			position = 2;
		} else if(position >= 100); {
			position = 3;
		}  {
			position = 4;
		} return position;
	}
}