package J5;

import java.util.Scanner;

public class J52010 {
    private static int[][] board = new int[8][8];
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt()-1; 
        int b = in.nextInt()-1; 
        int c = in.nextInt()-1;
        int d = in.nextInt()-1;
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = Integer.MAX_VALUE;
            }
        }
        knightMove(a,b,0);
        System.out.println(board[c][d]);
    }
    public static void knightMove(int x, int y, int steps) {
        if (x >= 0 && x < 8 && y >= 0 && y < 8 && steps < board[x][y]) {
            board[x][y] = steps;
            knightMove(x - 1, y + 2, steps + 1);
            knightMove(x - 1, y - 2, steps + 1);
            knightMove(x + 1, y + 2, steps + 1);
            knightMove(x + 1, y - 2, steps + 1);
            knightMove(x + 2, y + 1, steps + 1);
            knightMove(x + 2, y - 1, steps + 1);
            knightMove(x + 2, y + 1, steps + 1);
            knightMove(x + 2, y - 1, steps + 1);
        }
    }
}