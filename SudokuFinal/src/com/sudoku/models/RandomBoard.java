package com.sudoku.models;

import java.util.Random;

public class RandomBoard {

	public static int[][] GenerateBoard() {
		int board[][] = DefaultBoard.DefaultBoard00();
		MainBoard testBoard = new MainBoard();
		testBoard.setBoard(board);
		Random rand = new Random();
		
		Solve solver = new Solve();
		
		boolean valid = false;
		
		//while(valid == false) {		
		
		for (int i = 0; i < 3; i ++) {
		
			for (int j = 1; j < 10; j++) {
				int x = rand.nextInt(9);
				int y = rand.nextInt(9);
				int num = rand.nextInt(9) + 1;
			
				board[x][y] = num;									
			}
		
		}
		
		//}
		
		return board;
	}
	
}
