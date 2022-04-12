package com.udemy.tim;

public class Game {
	public static void main(String[] args) {
		//Code blocks And The If Then Else Control Statements
		int firstscore = 800;
		int firstlevelCompleted = 5;
		int firstbonus = 100;
		boolean firstgameOver = true;
		
		int secondScore = 10000;
		int secondlevelCompleted = 8;
		int secondbonus = 200;
		boolean secondgameOver = true;

		/*
		 * if (score < 5000 && score > 1000) {
		 * System.out.println("Your Score was less than 5000 but greater than 1000"); }
		 * else if(score < 1000) { System.out.println("Your score was less than 1000");
		 * } else { System.out.println("Control Got here"); }
		 */
		
		if (firstgameOver)
		{
			int firstfinalScore = firstscore + (firstlevelCompleted * firstbonus);
			System.out.println("Game is over! Your first final score was: "+firstfinalScore);
			
			int secondfinalScore = secondScore + (secondlevelCompleted * secondbonus);
			System.out.println("Game is over! Your second final score was: " + secondfinalScore);
		}		
	}
}