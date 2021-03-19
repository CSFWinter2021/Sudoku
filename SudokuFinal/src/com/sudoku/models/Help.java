package com.sudoku.models;

public class Help {

    //print out the possible values for the selected point.
    public static String movesRemaining(MainBoard board, Subboard subboard, Point point) {
    	
    	String S = new String("Suggested Moves: ");
    	int[] temp = new int[27];
    	int[][] fullboard = new int[9][9];
    	int[][] sub1 = new int[3][3];
    	int[][] sub2 = new int[3][3];
    	int[][] sub3 = new int[3][3];
    	int[][] sub4 = new int[3][3];
    	int[][] sub5 = new int[3][3];
    	int[][] sub6 = new int[3][3];
    	int[][] sub7 = new int[3][3];
    	int[][] sub8 = new int[3][3];
    	int[][] sub9 = new int[3][3];
        int i;
        int j;
        int k;
        int x = point.rowLocation;
        int y = point.columnLocation;
        
        //represents the numbers 1 through 9, to indicate whether they are valid at the current location.
        boolean[] exists = {false, false, false, false, false, false, false, false, false};
        
        //create an array from the board values.
        for (i = 0; i < 9; i++) {
        	for (j = 0; j < 9; j++) {
        		fullboard[i][j] = board.point[i][j].getValue();
        	}
        }
        
        for (i = 0; i < 9; i++) {
        	for(j = 0; j < 9; j++) {
        		System.out.print(fullboard[i][j] + " ");
        	}
        }
        System.out.println();
        
        //create arrays for the subboards.
        for (i = 0; i < 3; i++) {
        	for (j = 0; j < 3; j++) {
        		sub1[i][j] = fullboard[i][j];
        	}
        }
        
        for (i = 0; i < 3; i++) {
        	for (j = 0; j < 3; j++) {
        		sub2[i][j] = fullboard[i + 3][j];
        	}
        }
        
        for (i = 0; i < 3; i++) {
        	for (j = 0; j < 3; j++) {
        		System.out.print(sub2[i][j]);
        	}
        }
        
        for (i = 0; i < 3; i++) {
        	for (j = 0; j < 3; j++) {
        		sub3[i][j] = fullboard[i + 6][j];
        	}
        }
        
        for (i = 0; i < 3; i++) {
        	for (j = 0; j < 3; j++) {
        		sub4[i][j] = fullboard[i][j + 3];
        	}
        }
        for (i = 0; i < 3; i++) {
        	for (j = 0; j < 3; j++) {
        		sub5[i][j] = fullboard[i + 3][j + 3];
        	}
        }
        
        for (i = 0; i < 3; i++) {
        	for (j = 0; j < 3; j++) {
        		sub6[i][j] = fullboard[i + 6][j + 3];
        	}
        }
        
        for (i = 0; i < 3; i++) {
        	for (j = 0; j < 3; j++) {
        		sub7[i][j] = fullboard[i][j + 6];
        	}
        }
        
        for (i = 0; i < 3; i++) {
        	for (j = 0; j < 3; j++) {
        		sub8[i][j] = fullboard[i + 3][j + 6];
        	}
        }
        
        for (i = 0; i < 3; i++) {
        	for (j = 0; j < 3; j++) {
        		sub9[i][j] = fullboard[i + 6][j + 6];
        	}
        }
        
        //combine the board row, column, and subboard into a single array to analyze for missing values.
        for (i = 0; i < 9; i++) {
            temp[i] = board.point[i][x].getValue();
        }
        
        for (i = 0; i < 9; i++) {
            temp[(i + 9)] = board.point[y][i].getValue();
        }
        
        if (x < 3 && y < 3) {
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 18)] = sub1[0][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 21)] = sub1[1][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 24)] = sub1[2][i];
        		}
        	}
        }
        
        else if (x < 3 && (y > 2 && y < 6)) {
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 18)] = sub2[0][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 21)] = sub2[1][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 24)] = sub2[2][i];
        		}
        	}
        }
        
        else if (x < 3 && (y > 5 && y < 9)) {
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 18)] = sub3[0][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 21)] = sub3[1][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 24)] = sub3[2][i];
        		}
        	}
        }
        
        else if ((x > 2 && x < 6) && (y < 3)) {
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 18)] = sub4[0][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 21)] = sub4[1][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 24)] = sub4[2][i];
        		}
        	}
        }
        
        else if ((x > 2 && x < 6) && (y > 2 && y < 6)) {
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 18)] = sub5[0][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 21)] = sub5[1][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 24)] = sub5[2][i];
        		}
        	}
        }
        
        else if ((x > 2 && x < 6) && (y > 5 && y < 9)) {
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 18)] = sub6[0][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 21)] = sub6[1][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 24)] = sub6[2][i];
        		}
        	}
        }
        
        else if ((x > 5 && x < 9) && (y < 3)) {
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 18)] = sub7[0][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 21)] = sub7[1][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 24)] = sub7[2][i];
        		}
        	}
        }
        
        else if ((x > 5 && x < 9) && (y > 2 && y < 6)) {
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 18)] = sub8[0][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 21)] = sub8[1][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 24)] = sub8[2][i];
        		}
        	}
        }
        
        else {
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 18)] = sub9[0][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 21)] = sub9[1][i];
        		}
        	}
        	for (i = 0; i < 3; i++) {
        		for (j = 0; j < 3; j++) {
        			temp[(i + 24)] = sub9[2][i];
        		}
        	}
        }
        
        for (i = 0; i < temp.length; i++) {
        	
        	System.out.print(temp[i] + " ");
        	
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
            	//System.out.print((i + 1) + " ");
                S = S.concat((i + 1) + " ");
            }
           
        }
        return S;
    }
}
