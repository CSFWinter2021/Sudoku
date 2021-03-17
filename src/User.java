package com.sudoku.models;
import java.util.Scanner;

public class User {

    protected int userScore = 0;

    //print out the possible values for the selected point.
    public static void movesRemaining(MainBoard board, Subboard subboard, Point point) {
    	
        int i;
        int j;
        int k;
        int x = point.rowLocation;
        int y = point.columnLocation;
        int[] temp = new int[27];
        
        //represents the numbers 1 through 9, to indicate whether they are valid at the current location.
        boolean[] exists = {false, false, false, false, false, false, false, false, false};
        
        //combine the board row, column, and subboard into a single array to analyze for missing values.
        
        for (i = 0; i < 9; i++) {
            temp[i] = board[i][x];
        }
        
        for (i = 0; i < 9; i++) {
            temp[(i + 9)] = board[y][i];
        }
        
        for (i = 0; i < 3; i++) {
            temp[(i + 18)] = subboard[0][i];
        }
        
        for (i = 0; i < 3; i++) {
            temp[(i + 21)] = subboard[1][i];
        }
        
        for (i = 0; i < 3; i++) {
            temp[(i + 24)] = subboard[2][i];
        } 
        
        //iterate through the temp array to find 1-9.
        for (i = 0; i < exists.length; i++) {
            for (j = 0; j < temp.length; j++) {
                if (temp[j] == i + 1) {
                    exists[i] = true;
                }
            }
        }
        
        //print the missing values.
        for (i = 0; i < exists.length; i++) {
            if (exists[i] == false) {
                System.out.print((i + 1) + " ");
            }
        }
    }

    //add one to user score for game won
    private void setScore() {
    
        userScore++;

    }

    //get user score
    public int getScore() {

        return userScore;
    
    }
}
