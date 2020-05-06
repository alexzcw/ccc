package J4;

import java.util.Arrays;
import java.util.Scanner;

public class J42005 {
	public static int [][] board = new int [0][0];
	public static int w, h, steps, sw, sh, finalx, finaly;
	public static int count = 0;
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
        w = scanner.nextInt() - 1;
        h = scanner.nextInt() - 1;
        sw = scanner.nextInt();
        sh = scanner.nextInt();
        steps = scanner.nextInt();

        board = new int [h + 1][w + 1];
        create();
        spiral('R', 0, sw);
    }
	
	public static void spiral (char direction, int y, int x) {
		if (count == steps) {
			System.out.println((x+1) + "\n" + (y+1));
			System.exit(0);
			return;
		}
		if (board[y][x] == 1) {
			if (direction == 'D')
				System.out.println((x+1) + "\n" + (y));
			if (direction == 'U')
				System.out.println((x+1) + "\n" + (y+2));
			if (direction == 'L')
				System.out.println((x+2) + "\n" + (y+1));
			if (direction == 'R')
				System.out.println((x) + "\n" + (y+1));
			System.exit(0);
		}
		else
			board[y][x] = 1;
//		print(board);
		count++;
		
		if (direction == 'R') {
			if (y-1>= 0 && board[y-1][x] == 0)
				spiral('U', y-1, x);
			else if (x + 1 <= w && board[y][x+1] == 1 || x == w)
				spiral('D',y + 1, x);
			else
				spiral('R', y, x+ 1);
		}
		if (direction == 'L') {
			if (y + 1 <= h && board[y + 1][x] == 0)
				spiral('D', y + 1, x);
			else if (x - 1 >= 0 && board [y][x-1] == 1 || x == 0)
				spiral('U',  y - 1, x);
			else
				spiral('L', y, x - 1);
		}
		if (direction == 'U') {
			if (x -1 >= 0 && board [y][x-1] == 0)
				spiral('L', y, x-1);
			if (y - 1 >= 0 && board [y - 1][x] == 1 || y == 0)
				spiral('R', y, x + 1);
			else
				spiral('U', y - 1, x);
		}
		if (direction == 'D') {
			if (y + 1 <= h && board[y + 1][x] == 1 || y == h)
				spiral('L', y, x -1 );
			if (x + 1 <= w && board[y][x + 1] == 0)
				spiral('R', y, x + 1);
			else
				spiral('D', y + 1, x);
		}
	}
	
    public static void print(int [][] arr) {
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void create () {
    	for (int i = 0; i < sh; i++)
            for (int j = 0; j < sw; j++) 
                board[i][j] = 1;


        for (int i = h; i > h - sh; i--) 
            for (int j = w; j > w - sw; j--) 
                board[i][j] = 1;


        for (int i = h; i > h - sh; i--) 
            for (int j = 0; j < sw; j++) 
                board[i][j] = 1;
  

        for (int i = 0; i < sh; i++) 
            for (int j = w; j > w - sw; j--) 
                board[i][j] = 1;
    }

}
