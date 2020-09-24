package com.cg;

import java.util.Arrays;
import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Snake and ladder game simulator");
		
		int NO_OF_PLAYERS = 1;
		int position[] = new int[NO_OF_PLAYERS];
		Arrays.fill(position, 0);
		
		int MAX_ROLL = 6;
		Random rand = new Random();
		
		for( int player = 1; player <= NO_OF_PLAYERS; ++player) {
			System.out.println("Position of player "+ player + " is " + position[player-1]);
			
			int diceRoll = rand.nextInt(MAX_ROLL) +1;
			System.out.println("The dice roll for player "+ player + " is " + diceRoll);
			
		}

	}

}
