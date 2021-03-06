package com.cg;

import java.util.Arrays;
import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Snake and ladder game simulator");
		System.out.println("-------------------------------");
		
		int NO_OF_PLAYERS = 2;
		int position[] = new int[NO_OF_PLAYERS];
		Arrays.fill(position, 0);
		
		int MAX_ROLL = 6;
		Random rand = new Random();
		
		int totalRolls = 0;
		int winner = -1;
		while(winner==-1) {
			for( int player = 1; player <= NO_OF_PLAYERS; ++player) {
				boolean repeat = true;
				while(repeat){
					repeat = false;
					System.out.println("Position of player "+ player + " is " + position[player-1]);
					
					int diceRoll = rand.nextInt(MAX_ROLL) +1;
					totalRolls += 1;
					System.out.println("The dice roll for player "+ player + " is " + diceRoll);
					
					int option = rand.nextInt(3)+1;
					
					switch(option) {
					case 1:
						System.out.println(String.format("No play, Player %d remains at the same position, which is %d", player,position[player-1]));
						break;
					case 2:
						position[player-1] += diceRoll;
						if(position[player-1]>100){
							position[player-1] -= diceRoll;
							System.out.println(String.format("Player %d can't move ahead remain at %d, otherwise it'll to overshoot", player, position[player-1]));
						}
						else{
							System.out.println(String.format("Wow!! it's Ladder, Player %d moves ahead by %d steps", player, diceRoll));
							System.out.println(String.format("Updated position of the player %d is %d", player, position[player-1]));
						}
						repeat = position[player-1]!=100;
						break;
					default:
						position[player-1] -= diceRoll;
						if (position[player-1] < 0 ) position[player-1] = 0;
						System.out.println(String.format("Oops.. it's Snake, Player %d moves behind by %d steps", player, diceRoll));
						System.out.println(String.format("Updated position of the player %d is %d", player, position[player-1]));
					}
					System.out.println();
				}
				if (position[player-1] == 100) {
					winner = player;
					break;
				}
			}
		}
		System.out.println(String.format("Player %d won the game and total %d dice rolls were played", winner, totalRolls));

	}

}
