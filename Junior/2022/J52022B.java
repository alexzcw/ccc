package ccc2022;

import java.util.Arrays;
import java.util.Scanner;

public class J52022B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		
		int [][] close = {{0, 0},
						{n-1, 0},
						{0, n-1},
						{n-1, n-1}};
		
		for (int i = 0; i < t; i++) {
			int x = scanner.nextInt()-1;
			int y = scanner.nextInt()-1;

			if (x <= n/2 && y <= n/2) {
				if (x > close[0][0] || y > close[0][1]) {
					close[0][0] = x;
					close[0][1] = y;
				}
			}
			
			if (x >= n/2 && y <= n/2) {
				if (x < close[1][0] || y > close[1][1]) {
					close[1][0] = x;
					close[1][1] = y;
				}
			}
			
			if (x <= n/2 && y >= n/2) {
				if (x > close[2][0] || y < close[2][1]) {
					close[2][0] = x;
					close[2][1] = y;
				}
			}
			
			if (x >= n/2 && y >= n/2) {
				if (x < close[3][0] || y < close[3][1]) {
					close[3][0] = x;
					close[3][1] = y;
				}
			}
		}
		
		int [] x = new int [4];
		x[0] = close[0][0];
		x[1] = close[1][0];
		x[2] = close[2][0];
		x[3] = close[3][0];
		Arrays.sort(x);

		int [] y = new int [4];
		y[0] = close[0][1];
		y[1] = close[1][1];
		y[2] = close[2][1];
		y[3] = close[3][1];
		
		Arrays.sort(y);
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
		int maxX = x[3] - x[0];
		int maxY = y[3] - y[0];
		
		System.out.println(maxX + " " + maxY);
//		print(close);
	}
	
	private static void print (int[][] arr) {
		for (int[] x : arr) {
			for (int y : x)
				System.out.print(y + " ");
			System.out.println();
		}
	}
}
