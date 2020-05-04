package J5;

import java.util.Scanner;

public class J52012 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		int count = 0;
		
		int [][] coins = new int [n][n];
		
		for (int i = 0; i < n; i++) {
			coins[0][i] = scanner.nextInt();
		}
		
		
		System.out.println("f---");
		print(coins);
	}
	public static int[][] msl(int[][]coins) {
		int [][] temp = new int [coins.length][coins.length];
		int [][] past = new int [coins.length][coins.length];

		temp = coins;
		
		int r = 0;

		for (int c = coins.length - 1; c > 0; c--) {
			if (coins[r][c] < coins[r][c-1]) {
				coins = movecdown(coins, c-1);
				coins[r][c - 1] = coins[r][c];
				coins = movecup(coins, c);
			}
			System.out.println("1---");
			print(coins);
			past = temp;
			temp = coins;
//			System.out.println("p---");
//			print(past);
		}
		return coins;
	}
	public static int[][] msr(int[][]coins) {
		int [][] temp = new int [coins.length][coins.length];
		int [][] past = new int [coins.length][coins.length];

		temp = coins;
		
		int r = 0;

		for (int c = 0; c < coins.length - 1; c++) {
			if (coins[r][c] < coins[r][c+1]) {
				coins = movecdown(coins, c + 1);
				coins[r][c + 1] = coins[r][c];
				coins = movecup(coins, c);
			}
			System.out.println("1---");
			print(coins);
			past = temp;
			temp = coins;
//			System.out.println("p---");
//			print(past);
		}
		return coins;
	}
	public static int[][] mzr(int[][]coins) {
		int [][] temp = new int [coins.length][coins.length];
		int [][] past = new int [coins.length][coins.length];
		
		temp = coins;
		
		int r = 0;

		for (int c = 0; c < coins.length - 1; c++) {
			if (coins[r][c+1] == 0) {
				coins[r][c+1] = coins[r][c];
				coins = movecup(coins, c);
			}
			System.out.println("2---");
			print(coins);
			past = temp;
			temp = coins;
//			System.out.println("p---");
//			print(past);
		}
		return coins;
	}
	public static int[][] mzl(int[][]coins) {
		int [][] temp = new int [coins.length][coins.length];
		int [][] past = new int [coins.length][coins.length];
		
		temp = coins;
		
		int r = 0;

		for (int c = coins.length - 1; c > 1; c--) {
			if (coins[r][c - 1] == 0) {
				coins[r][c-1] = coins[r][c];
				coins = movecup(coins, c);
			}
			System.out.println("2---");
			print(coins);
			past = temp;
			temp = coins;
//			System.out.println("p---");
//			print(past);
		}
		return coins;
	}
	
	public static int[][] movecdown (int[][]coins, int c) {
		for (int i = coins.length - 2; i > -1; i--) {
			coins[i+1][c] = coins[i][c];
			coins[i][c] = 0;
//			print(coins);
		}
		return coins;
	}
	public static int[][] movecup (int[][]coins, int c) {
		for (int i = 1; i < coins.length - 1; i++) {
			coins[i - 1][c] = coins[i][c];
			coins[i][c] = 0;
//			print(coins);
		}
		return coins;
	}
	public static void print (int[][]coins) {
		for (int[] x : coins){
		   for (int y : x) {
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}
	}
	public static boolean same (int[][]one, int[][]two) {
		for(int i = 0; i < one.length - 1; i++) {
			for (int j = 0; j < one.length - 1; j++) {
				if (one[i][j] != two[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}