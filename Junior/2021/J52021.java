package ccc2021;

import java.util.Scanner;

public class J52021 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int [][] canvas = new int [m][n];
		
		int k = scanner.nextInt();
		scanner.nextLine();
		int count = 0;
		for (int i = 0; i < k; i++) {
			String d = scanner.next();
			int c = scanner.nextInt();
			if (d.equals("R")) {
				for (int j = 0; j < n; j++) {
					if (canvas[c-1][j] == 0) {
						canvas[c-1][j] = 1;
						count++;
					}
					else {
						canvas[c-1][j] = 0;
						count--;
					}
				}
			} else {
				for (int j = 0; j < m; j++) {
					if (canvas[j][c-1] == 0) {
						canvas[j][c-1] = 1;
						count++;
					}
					else {
						canvas[j][c-1] = 0;
						count--;
					}
				}
			}
		}
		
		print (canvas);
		System.out.println(count);
	}
	static void print (int [][] array) {
		for (int[] x : array) {
		   for (int y : x)
		        System.out.print(y + " ");
		   System.out.println();
		}
	}
}
