package J5;

import java.util.Scanner;

public class J52006 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);		
		int[][] board = new int[8][8];
		char config = scanner.next().charAt(0);
		int moves = scanner.nextInt() * 2;
		
		if (config == 'a') {
	            board[3][3] = 1;
	            board[4][4] = 1;
	            board[3][4] = 2;
	            board[4][3] = 2;
	        } else if (config == 'b') {
	            for (int i = 0; i < 8; i++) {
	                board[i][i] = 2;
	            }
	            for (int i = 0; i < 8; i++) {
	                board[i][7 - i] = 1;
	            }
	        } else if (config == 'c') {
	            for (int i = 0; i < 8; i++) {
	                for (int j = 0; j < 2; j++) {
	                    board[i][j+2] = 2;
	                }
	            }
	            for (int i = 0; i < 8; i++) {
	                for (int j = 0; j < 2; j++) {
	                    board[i][j+ 4] = 1;
	                }
	            }
	        }
		
		boolean black = true;
		for (int i = 1; i < moves; i++) {
			int r = scanner.nextInt() - 1;
			int c = scanner.nextInt() - 1;

			if (black == true) {
				board[r][c] = 1;
				black = false;
			} else {
				board[r][c] = 2;
				black = true;
			}
			
			for (int sr = r - 1; sr < r + 1; sr++) {
				for (int sc = c - 1; sc < c + 1; sc++) {
					if (board[sr][sc] != 0) {
						if (black)
							board[sr][sc] = 1;
						else
							board[sr][sc] = 2;
					}
				}
			}
		}
		
		int bcount = 0;
		int wcount = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j] == 1)
					bcount++;
				if (board[i][j] == 2)
					wcount++;
			}
		}
		
		System.out.println(wcount + " " + bcount);
//		for(int i = 0; i<8; i++) {
//		    for(int j = 0; j<8; j++)
//		        System.out.print(board[i][j] + " ");
//		    System.out.println();
//		}
	}
}
