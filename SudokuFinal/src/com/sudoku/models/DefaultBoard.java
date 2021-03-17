package com.sudoku.models;

import java.util.Random;

public class DefaultBoard {
//This board is left blank for testing purposes the rest of the boards are solvable sudoku puzzles
	static int[][] DefaultBoard00() {
		int a[][] = {
				
				{0, 0, 0,  0, 0, 0,  0, 0, 0}, 
				{0, 0, 0,  0, 0, 0,  0, 0, 0}, 
				{0, 0, 0,  0, 0, 0,  0, 0, 0},
				
				{0, 0, 0,  0, 0, 0,  0, 0, 0},
				{0, 0, 0,  0, 0, 0,  0, 0, 0},
				{0, 0, 0,  0, 0, 0,  0, 0, 0},
				
				{0, 0, 0,  0, 0, 0,  0, 0, 0},
				{0, 0, 0,  0, 0, 0,  0, 0, 0},
				{0, 0, 0,  0, 0, 0,  0, 0, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard01() {
		int a[][] = {
				
				{5, 7, 0,  0, 0, 3,  1, 8, 9}, 
				{0, 2, 0,  7, 1, 0,  0, 6, 0}, 
				{0, 0, 0,  0, 9, 0,  2, 4, 0},
				
				{0, 0, 0,  1, 0, 7,  9, 0, 6},
				{2, 3, 0,  9, 5, 0,  0, 0, 4},
				{7, 0, 1,  0, 3, 6,  8, 0, 0},
				
				{0, 6, 2,  5, 7, 0,  4, 0, 0},
				{1, 0, 0,  0, 0, 0,  5, 0, 0},
				{9, 5, 0,  3, 4, 0,  6, 7, 1} 
			};
		return a;
	}

	static int[][] DefaultBoard02() {
		int a[][] = {
				
				{7, 8, 0,  0, 4, 2,  1, 3, 0}, 
				{0, 0, 3,  0, 0, 0,  0, 6, 0}, 
				{0, 0, 0,  3, 5, 7,  8, 0, 9},
				
				{0, 0, 5,  0, 2, 0,  0, 4, 0},
				{0, 0, 4,  5, 0, 3,  2, 9, 6},
				{0, 2, 0,  0, 6, 4,  5, 1, 0},
				
				{4, 0, 0,  2, 0, 5,  0, 7, 1},
				{3, 6, 2,  7, 0, 0,  9, 0, 0},
				{5, 7, 0,  0, 9, 6,  3, 0, 2} 
			};
		return a;
	}
	
	static int[][] DefaultBoard03() {
		int a[][] = {
				
				{5, 0, 0,  6, 0, 7,  0, 0, 0}, 
				{0, 0, 0,  9, 4, 0,  8, 3, 7}, 
				{0, 7, 9,  8, 0, 0,  0, 0, 0},
				
				{6, 0, 8,  7, 2, 0,  0, 9, 0},
				{0, 0, 1,  5, 8, 9,  0, 0, 3},
				{7, 9, 3,  4, 0, 0,  0, 8, 2},
				
				{0, 1, 0,  2, 0, 0,  3, 6, 9},
				{0, 3, 0,  1, 0, 0,  0, 0, 0},
				{0, 0, 0,  3, 0, 8,  7, 1, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard04() {
		int a[][] = {
				
				{0, 9, 1,  0, 4, 0,  0, 5, 0}, 
				{7, 0, 0,  0, 0, 0,  0, 0, 1}, 
				{0, 0, 0,  3, 0, 7,  0, 0, 9},
				
				{9, 0, 4,  0, 0, 0,  5, 0, 0},
				{1, 6, 0,  5, 0, 8,  2, 0, 0},
				{3, 0, 0,  4, 2, 1,  7, 9, 0},
				
				{0, 5, 9,  0, 0, 0,  1, 7, 0},
				{4, 1, 0,  0, 0, 0,  0, 8, 5},
				{0, 0, 8,  0, 0, 0,  0, 3, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard05() {
		int a[][] = {
				
				{6, 2, 0,  0, 0, 7,  5, 0, 0}, 
				{0, 0, 4,  5, 0, 0,  0, 0, 0}, 
				{0, 7, 5,  0, 0, 0,  0, 0, 0},
				
				{9, 6, 0,  0, 0, 0,  4, 0, 7},
				{0, 4, 0,  9, 0, 1,  2, 0, 6},
				{0, 5, 3,  0, 0, 6,  0, 1, 0},
				
				{0, 3, 6,  0, 8, 9,  0, 2, 0},
				{4, 9, 0,  6, 0, 5,  3, 0, 0},
				{0, 8, 0,  0, 0, 0,  6, 9, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard06() {
		int a[][] = {
				
				{1, 0, 5,  4, 0, 0,  7, 3, 0}, 
				{0, 8, 0,  0, 0, 1,  0, 9, 0}, 
				{0, 2, 6,  9, 0, 3,  0, 0, 0},
				
				{0, 7, 0,  2, 4, 9,  0, 1, 5},
				{3, 0, 2,  0, 0, 0,  4, 6, 9},
				{0, 0, 4,  0, 3, 6,  8, 2, 0},
				
				{0, 3, 0,  0, 0, 0,  9, 8, 0},
				{0, 6, 0,  0, 0, 0,  2, 0, 3},
				{0, 4, 9,  3, 0, 8,  5, 7, 6} 
			};
		return a;
	}

	static int[][] DefaultBoard07() {
		int a[][] = {
				
				{0, 0, 0,  3, 6, 2,  7, 0, 0}, 
				{0, 7, 0,  0, 1, 0,  0, 6, 3}, 
				{6, 2, 0,  0, 5, 9,  0, 8, 0},
				
				{2, 3, 0,  6, 0, 0,  0, 0, 0},
				{0, 0, 0,  9, 0, 3,  5, 7, 2},
				{0, 0, 7,  2, 0, 1,  3, 0, 0},
				
				{7, 0, 2,  1, 0, 4,  6, 0, 8},
				{3, 0, 8,  0, 9, 6,  0, 2, 0},
				{0, 0, 0,  8, 0, 7,  0, 0, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard08() {
		int a[][] = {
				
				{0, 3, 0,  0, 2, 0,  0, 0, 7}, 
				{1, 0, 0,  5, 0, 0,  0, 2, 6}, 
				{2, 0, 0,  0, 7, 6,  1, 3, 5},
				
				{0, 2, 0,  0, 1, 4,  0, 0, 0},
				{8, 1, 3,  0, 6, 2,  7, 0, 0},
				{4, 0, 9,  0, 0, 8,  0, 0, 0},
				
				{0, 5, 2,  0, 0, 1,  0, 9, 3},
				{9, 6, 4,  2, 0, 0,  5, 1, 0},
				{3, 8, 1,  0, 0, 5,  4, 7, 2} 
			};
		return a;
	}

	static int[][] DefaultBoard09() {
		int a[][] = {
				
				{0, 0, 3,  0, 0, 0,  0, 0, 0}, 
				{8, 0, 0,  0, 0, 9,  7, 0, 3}, 
				{7, 0, 0,  0, 5, 0,  1, 2, 0},
				
				{2, 0, 4,  9, 3, 0,  0, 0, 8},
				{9, 6, 1,  8, 0, 4,  0, 5, 0},
				{0, 0, 0,  2, 6, 1,  9, 4, 7},
				
				{6, 2, 0,  0, 8, 0,  4, 0, 0},
				{0, 0, 8,  0, 9, 0,  2, 3, 0},
				{5, 3, 0,  0, 0, 0,  8, 0, 6} 
			};
		return a;
	}

	static int[][] DefaultBoard10() {
		int a[][] = {
				
				{0, 0, 0,  0, 0, 0,  0, 0, 8}, 
				{9, 5, 0,  0, 0, 4,  0, 6, 7}, 
				{7, 0, 6,  5, 0, 0,  9, 0, 0},
				
				{0, 1, 0,  3, 0, 0,  4, 5, 6},
				{0, 3, 2,  0, 8, 6,  0, 9, 1},
				{4, 6, 0,  0, 0, 0,  8, 3, 0},
				
				{0, 7, 0,  0, 3, 8,  0, 0, 0},
				{6, 9, 0,  7, 4, 0,  0, 0, 0},
				{2, 4, 8,  0, 0, 0,  1, 7, 3} 
			};
		return a;
	}

	static int[][] DefaultBoard11() {
		int a[][] = {
				
				{0, 6, 2,  7, 3, 0,  0, 9, 1}, 
				{0, 0, 0,  0, 0, 0,  0, 0, 7}, 
				{0, 1, 3,  5, 9, 2,  0, 0, 6},
				
				{1, 7, 0,  0, 0, 6,  3, 8, 2},
				{0, 3, 5,  8, 7, 9,  1, 6, 0},
				{0, 0, 6,  2, 0, 0,  0, 5, 9},
				
				{5, 0, 0,  9, 0, 8,  0, 1, 3},
				{0, 0, 0,  0, 0, 0,  0, 0, 8},
				{3, 9, 8,  0, 0, 7,  0, 0, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard12() {
		int a[][] = {
				
				{0, 4, 0,  0, 9, 0,  6, 5, 0}, 
				{1, 3, 0,  6, 5, 0,  0, 4, 0}, 
				{6, 9, 0,  1, 2, 4,  7, 8, 3},
				
				{9, 0, 2,  0, 0, 0,  8, 0, 0},
				{0, 5, 3,  0, 0, 0,  4, 0, 7},
				{0, 0, 1,  0, 0, 5,  0, 9, 2},
				
				{0, 1, 0,  5, 8, 0,  0, 0, 0},
				{5, 2, 0,  7, 4, 9,  1, 0, 8},
				{0, 8, 9,  0, 1, 0,  5, 7, 4} 
			};
		return a;
	}

	static int[][] DefaultBoard13() {
		int a[][] = {
				
				{0, 6, 1,  5, 0, 0,  0, 3, 0}, 
				{7, 5, 8,  6, 3, 0,  2, 1, 4}, 
				{0, 0, 0,  7, 1, 8,  0, 0, 0},
				
				{0, 3, 4,  8, 6, 0,  7, 0, 0},
				{0, 0, 0,  0, 7, 0,  4, 6, 8},
				{8, 0, 6,  4, 9, 5,  3, 0, 0},
				
				{5, 0, 7,  0, 4, 2,  6, 0, 9},
				{0, 0, 9,  1, 8, 0,  0, 4, 3},
				{4, 8, 0,  9, 0, 0,  0, 0, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard14() {
		int a[][] = {
				
				{8, 2, 1,  6, 7, 4,  0, 5, 0}, 
				{4, 9, 0,  5, 0, 0,  7, 0, 0}, 
				{5, 6, 7,  0, 0, 3,  4, 2, 0},
				
				{9, 5, 0,  1, 0, 0,  6, 0, 2},
				{0, 3, 0,  0, 8, 5,  1, 0, 0},
				{7, 0, 4,  0, 0, 0,  0, 0, 5},
				
				{0, 0, 0,  2, 4, 9,  3, 8, 0},
				{0, 0, 0,  7, 6, 8,  5, 0, 9},
				{0, 0, 0,  3, 5, 0,  2, 7, 4} 
			};
		return a;
	}

	static int[][] DefaultBoard15() {
		int a[][] = {
				
				{0, 0, 0,  3, 6, 2,  7, 0, 0}, 
				{0, 7, 0,  0, 1, 0,  0, 6, 3}, 
				{6, 2, 0,  0, 5, 9,  0, 8, 0},
				
				{2, 3, 0,  6, 0, 0,  0, 0, 0},
				{0, 0, 0,  9, 0, 3,  5, 7, 2},
				{0, 0, 7,  2, 0, 1,  3, 0, 0},
				
				{7, 0, 2,  1, 0, 4,  6, 0, 8},
				{3, 0, 8,  0, 9, 6,  0, 2, 0},
				{0, 0, 0,  8, 0, 7,  0, 0, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard16() {
		int a[][] = {
				
				{6, 0, 9,  5, 8, 0,  7, 0, 0}, 
				{1, 7, 0,  4, 2, 6,  9, 8, 0}, 
				{3, 0, 8,  0, 7, 0,  5, 2, 6},
				
				{7, 0, 1,  0, 4, 5,  6, 0, 8},
				{0, 0, 2,  1, 0, 0,  0, 7, 0},
				{0, 0, 4,  0, 6, 8,  1, 3, 0},
				
				{0, 1, 0,  0, 0, 2,  8, 6, 4},
				{0, 0, 3,  6, 0, 7,  0, 1, 0},
				{2, 0, 6,  0, 0, 4,  0, 0, 7} 
			};
		return a;
	}

	static int[][] DefaultBoard17() {
		int a[][] = {
				
				{6, 0, 0,  1, 0, 2,  8, 0, 9}, 
				{0, 0, 9,  6, 0, 3,  0, 7, 2}, 
				{4, 2, 0,  8, 7, 9,  6, 5, 0},
				
				{1, 0, 0,  0, 0, 0,  5, 2, 0},
				{0, 0, 0,  7, 6, 8,  9, 1, 0},
				{9, 0, 7,  0, 1, 0,  0, 6, 8},
				
				{7, 3, 5,  0, 0, 6,  0, 8, 0},
				{8, 0, 6,  0, 3, 0,  2, 9, 0},
				{0, 0, 0,  5, 0, 1,  0, 0, 6} 
			};
		return a;
	}

	static int[][] DefaultBoard18() {
		int a[][] = {
				
				{7, 0, 6,  5, 0, 3,  0, 8, 0}, 
				{4, 0, 5,  0, 0, 1,  2, 3, 7}, 
				{1, 2, 0,  0, 4, 8,  9, 0, 5},
				
				{0, 6, 0,  0, 0, 2,  0, 4, 9},
				{3, 0, 0,  0, 8, 0,  5, 0, 0},
				{0, 0, 0,  3, 0, 9,  0, 1, 6},
				
				{9, 0, 1,  2, 6, 0,  7, 0, 8},
				{0, 0, 0,  0, 3, 5,  0, 0, 0},
				{8, 0, 4,  0, 1, 0,  0, 2, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard19() {
		int a[][] = {
				
				{0, 0, 0,  0, 7, 2,  4, 0, 0}, 
				{0, 4, 6,  9, 3, 8,  0, 2, 5}, 
				{0, 2, 0,  0, 4, 6,  0, 9, 3},
				
				{3, 0, 4,  0, 0, 0,  0, 5, 0},
				{6, 9, 2,  0, 5, 0,  3, 0, 1},
				{0, 1, 0,  0, 0, 0,  0, 6, 0},
				
				{0, 3, 0,  7, 0, 5,  1, 0, 4},
				{4, 6, 1,  0, 8, 3,  5, 7, 9},
				{0, 0, 0,  4, 0, 0,  0, 3, 2} 
			};
		return a;
	}

	static int[][] DefaultBoard20() {
		int a[][] = {
				
				{0, 0, 6,  0, 0, 0,  0, 0, 9}, 
				{7, 0, 1,  0, 3, 0,  0, 0, 6}, 
				{5, 0, 9,  0, 6, 1,  2, 0, 0},
			
				{9, 0, 0,  0, 8, 0,  1, 0, 5},
				{6, 0, 0,  5, 9, 0,  0, 0, 0},
				{0, 5, 4,  1, 7, 3,  6, 9, 0},
			
				{0, 9, 5,  8, 4, 0,  0, 2, 0},
				{4, 0, 0,  7, 0, 0,  0, 0, 1},
				{0, 0, 0,  0, 1, 9,  4, 0, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard21() {
		int a[][] = {
				
				{6, 3, 7,  0, 9, 1,  4, 0, 8}, 
				{5, 1, 0,  0, 3, 8,  6, 0, 7}, 
				{8, 0, 0,  4, 7, 0,  0, 3, 0},
				
				{7, 5, 0,  1, 8, 4,  0, 6, 9},
				{9, 4, 6,  0, 2, 0,  8, 5, 1},
				{0, 8, 0,  6, 5, 9,  7, 4, 0},
				
				{0, 7, 0,  0, 0, 5,  3, 1, 2},
				{1, 9, 2,  7, 4, 3,  5, 0, 0},
				{0, 6, 0,  8, 1, 2,  0, 7, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard22() {
		int a[][] = {
				
				{2, 0, 0,  1, 0, 6,  0, 0, 9}, 
				{0, 8, 0,  4, 2, 3,  0, 0, 1}, 
				{0, 0, 0,  5, 0, 0,  0, 0, 0},
				
				{0, 0, 2,  0, 0, 4,  1, 0, 0},
				{0, 9, 8,  0, 1, 0,  4, 0, 2},
				{0, 0, 5,  9, 0, 0,  0, 0, 7},
				
				{0, 0, 0,  0, 0, 0,  0, 7, 4},
				{0, 6, 0,  0, 3, 8,  2, 0, 0},
				{7, 0, 1,  0, 0, 0,  0, 0, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard23() {
		int a[][] = {
				
				{0, 5, 8,  9, 6, 0,  1, 7, 3}, 
				{0, 0, 6,  4, 0, 7,  0, 0, 5}, 
				{7, 0, 0,  0, 1, 5,  0, 6, 0},
				
				{8, 7, 0,  0, 0, 0,  0, 0, 1},
				{9, 3, 0,  8, 0, 1,  0, 0, 0},
				{0, 0, 0,  2, 5, 3,  9, 8, 7},
				
				{0, 0, 4,  1, 0, 6,  0, 3, 9},
				{2, 0, 0,  0, 3, 9,  0, 0, 8},
				{0, 0, 3,  7, 0, 0,  0, 2, 6} 
			};
		return a;
	}

	static int[][] DefaultBoard24() {
		int a[][] = {
				
				{0, 0, 3,  0, 0, 0,  0, 6, 0}, 
				{4, 1, 5,  7, 0, 0,  0, 0, 9}, 
				{2, 8, 0,  0, 0, 0,  0, 0, 7},
				
				{0, 0, 0,  9, 5, 0,  0, 1, 0},
				{0, 0, 0,  0, 1, 0,  3, 0, 0},
				{0, 5, 0,  3, 0, 4,  9, 0, 2},
				
				{0, 0, 9,  0, 0, 0,  2, 4, 0},
				{1, 4, 0,  0, 9, 8,  7, 0, 3},
				{0, 3, 7,  4, 0, 0,  0, 9, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard25() {
		int a[][] = {
				
				{5, 1, 8,  0, 0, 7,  3, 0, 0}, 
				{0, 0, 7,  5, 8, 0,  4, 0, 0}, 
				{2, 6, 4,  1, 0, 0,  8, 0, 0},
				
				{6, 0, 0,  0, 0, 5,  7, 8, 0},
				{0, 0, 3,  4, 6, 8,  0, 9, 2},
				{0, 0, 0,  0, 0, 1,  0, 0, 0},
				
				{0, 0, 0,  0, 5, 0,  0, 1, 4},
				{0, 0, 5,  6, 9, 0,  2, 3, 0},
				{4, 3, 0,  0, 0, 2,  0, 0, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard26() {
		int a[][] = {
				
				{7, 5, 1,  0, 6, 0,  0, 0, 0}, 
				{3, 0, 9,  0, 4, 1,  7, 0, 5}, 
				{0, 8, 0,  0, 0, 7,  1, 9, 0},
				
				{2, 0, 0,  0, 0, 0,  6, 0, 4},
				{0, 4, 0,  7, 5, 0,  0, 3, 9},
				{0, 3, 8,  0, 0, 0,  0, 7, 0},
				
				{0, 0, 3,  2, 7, 8,  0, 0, 0},
				{5, 0, 2,  0, 0, 0,  3, 8, 7},
				{8, 9, 7,  0, 3, 0,  2, 4, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard27() {
		int a[][] = {
				
				{0, 9, 0,  0, 7, 3,  5, 0, 0}, 
				{2, 0, 0,  0, 5, 0,  0, 9, 0}, 
				{0, 4, 0,  0, 1, 8,  3, 6, 2},
				
				{0, 0, 6,  0, 0, 9,  4, 3, 0},
				{0, 2, 8,  3, 6, 0,  9, 0, 0},
				{0, 0, 9,  1, 4, 0,  8, 2, 6},
				
				{8, 6, 7,  0, 0, 0,  2, 4, 0},
				{9, 5, 2,  0, 8, 4,  0, 7, 3},
				{1, 3, 0,  7, 0, 0,  6, 5, 8} 
			};
		return a;
	}

	static int[][] DefaultBoard28() {
		int a[][] = {
				
				{9, 0, 5,  0, 0, 1,  0, 8, 0}, 
				{2, 0, 7,  9, 0, 3,  5, 6, 1}, 
				{0, 0, 4,  0, 8, 7,  0, 3, 0},
				
				{4, 0, 8,  0, 0, 0,  2, 5, 7},
				{0, 0, 1,  6, 2, 4,  8, 0, 3},
				{3, 0, 2,  0, 5, 0,  0, 0, 0},
				
				{0, 4, 0,  0, 0, 0,  1, 0, 5},
				{0, 0, 3,  4, 0, 0,  6, 7, 8},
				{0, 0, 6,  0, 1, 2,  0, 0, 9} 
			};
		return a;
	}

	static int[][] DefaultBoard29() {
		int a[][] = {
				
				{0, 0, 0,  7, 0, 0,  0, 6, 2}, 
				{9, 5, 0,  6, 0, 0,  3, 7, 0}, 
				{0, 7, 6,  3, 0, 0,  0, 4, 5},
				
				{0, 0, 0,  1, 0, 3,  0, 5, 7},
				{5, 2, 7,  4, 0, 0,  0, 0, 0},
				{0, 1, 3,  0, 0, 0,  0, 0, 0},
				
				{1, 0, 2,  9, 0, 0,  0, 0, 0},
				{3, 0, 5,  8, 0, 4,  0, 0, 0},
				{0, 9, 8,  0, 0, 0,  0, 3, 0} 
			};
		return a;
	}

	static int[][] DefaultBoard30() {
		int a[][] = {
				
				{3, 0, 5,  7, 2, 0,  0, 4, 0}, 
				{0, 9, 6,  3, 1, 5,  8, 2, 7}, 
				{2, 8, 0,  0, 6, 4,  0, 5, 1},
				
				{0, 5, 0,  1, 0, 0,  7, 8, 0},
				{0, 3, 2,  6, 8, 0,  5, 1, 4},
				{1, 0, 8,  5, 3, 0,  6, 9, 0},
				
				{0, 7, 4,  2, 0, 3,  1, 6, 8},
				{5, 0, 1,  0, 7, 0,  4, 0, 0},
				{0, 6, 0,  0, 9, 0,  2, 0, 0} 
			};
		return a;
	}
	

//This selects a random board from the selection of 30
	static int[][] RandomBoard() {
		Random rand = new Random();
		int r = rand.nextInt(30);
		int a[][] = DefaultBoard00();
		
		switch (r) {
		case 0:
			a = DefaultBoard01();
		break;
		case 1:
			a = DefaultBoard02();
		break;
		case 2:
			a = DefaultBoard03();
		break;
		case 3:
			a = DefaultBoard04();
		break;
		case 4:
			a = DefaultBoard05();
		break;
		case 5:
			a = DefaultBoard06();
		break;
		case 6:
			a = DefaultBoard07();
		break;
		case 7:
			a = DefaultBoard08();
		break;
		case 8:
			a = DefaultBoard09();
		break;
		case 9:
			a = DefaultBoard10();
		break;
		case 10:
			a = DefaultBoard11();
		break;
		case 11:
			a = DefaultBoard12();
		break;
		case 12:
			a = DefaultBoard13();
		break;
		case 13:
			a = DefaultBoard14();
		break;
		case 14:
			a = DefaultBoard15();
		break;
		case 15:
			a = DefaultBoard16();
		break;
		case 16:
			a = DefaultBoard17();
		break;
		case 17:
			a = DefaultBoard18();
		break;
		case 18:
			a = DefaultBoard19();
		break;
		case 19:
			a = DefaultBoard20();
		break;
		case 20:
			a = DefaultBoard21();
		break;
		case 21:
			a = DefaultBoard22();
		break;
		case 22:
			a = DefaultBoard23();
		break;
		case 23:
			a = DefaultBoard24();
		break;
		case 24:
			a = DefaultBoard25();
		break;
		case 25:
			a = DefaultBoard26();
		break;
		case 26:
			a = DefaultBoard27();
		break;
		case 27:
			a = DefaultBoard28();
		break;
		case 28:
			a = DefaultBoard29();
		break;
		case 29:
			a = DefaultBoard30();
		break;
		}
		
		return a;
		
	}	
	
}


	


	