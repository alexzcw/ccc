package ccc2022;

import java.io.*;
import java.util.*;

public class J52022 {
	public static int [][] yard;
	public static int n;
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		n = scanner.nextInt();
		yard = new int [n][n];
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int x = scanner.nextInt()-1;
			int y = scanner.nextInt()-1;
			yard[x][y] = 1;
		}
		
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int z = 1; z <= n; z++) {
					if (hasTree(i, j, z) && z > max)
						max = z;
				}
			}
		}
		
		System.out.println(max);
		print(yard);
	}
	
	private static void print (int[][] arr) {
		for (int[] x : arr) {
			for (int y : x)
				System.out.print(y + " ");
			System.out.println();
		}
	}
	
	private static boolean hasTree (int x, int y, int m) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if ((x+i) >=n || (y+j >=n))
					return false;
				if(yard[x+i][y+j] == 1)
					return false;
			}
		}
		
		return true;
	}
}
