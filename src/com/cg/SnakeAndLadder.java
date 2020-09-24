package com.cg;

import java.util.Arrays;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Snake and ladder game simulator");
		
		int NO_OF_PLAYERS = 1;
		int position[] = new int[NO_OF_PLAYERS];
		Arrays.fill(position, 0);
		for( int i = 0; i< NO_OF_PLAYERS; ++i) {
			System.out.println("Position of player "+ String.format("%d",i+1) + " is " + position[i]);
		}

	}

}
