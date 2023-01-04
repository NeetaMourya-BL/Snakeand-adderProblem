package com.bridgelabz.snakeandladderproblem;

/*
* This problem simulates a Snake and Ladder Game. The Player
* starts from 0 rolls the die to get a number between 1 to 6, finds
* a safe place, ladder or a snake keeps doing till the winning spot
* 100 is achieved.
*/

//Snake & Ladder Simulator

public class SnakeandLadderProblem {

	public static final int START_POSITION = 0;
	public static final int FINAL_POSITION = 100;
	public static int currentPosition;

	public static void main(String[] args) {

		System.out.println("Welcome to Snake & Ladder Simulator Program");
		currentPosition = START_POSITION;
		int rollPlayer1 = diceRolls("player1");
		int rollPlayer2 = diceRolls("player2");
		if (rollPlayer1 > rollPlayer2) {
			System.out.println("Player2 is the winner");
		} else if (rollPlayer1 < rollPlayer2) {
			System.out.println("Player1 is the winner");
		} else {
			System.out.println("It is a tie.");
		}

	}

	public static int diceRolls(String player) {
		int noOfRolls = 0;
		int currentPosition = START_POSITION;
		/*
		 * Note In case the player position moves below 0, then the player restarts from
		 * 0
		 */

		while (currentPosition < FINAL_POSITION) {

			// between 1 to 6. - Use ((RANDOM)) to get the number between 1 to 6
			int diceResult = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			noOfRolls++;
			/*
			 * - Use ((RANDOM)) to check for Options - In Case of No Play the player stays
			 * in the same position - In Case of Ladder the player moves ahead by the number
			 * of position received in the die - In Case of Snake the player moves behind by
			 * the number of position received in the die
			 */
			int playCheck = (int) (Math.floor(Math.random() * 10) % 3);

			/*
			 * position 100. - Note in case the player position go above 100, the player
			 * stays in the same previous position till the player gets the exact number
			 */
			if (playCheck == 0) {
				currentPosition += 0;
			} else if (playCheck == 1) {
				currentPosition += diceResult;
				if (currentPosition > 100) {
					currentPosition -= diceResult;
				}
			} else {
				currentPosition -= diceResult;
				if (currentPosition < 0) {
					currentPosition = START_POSITION;
				}
			}
			System.out.println(currentPosition);
		}
		System.out.println("No. of total Dice Rolls by " + player + " are: " + noOfRolls);
		return noOfRolls;
	}
}