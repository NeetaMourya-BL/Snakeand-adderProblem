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
	}
}
