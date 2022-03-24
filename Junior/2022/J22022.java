package ccc2022;

import java.io.*;
import java.util.*;

public class J22022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		
		int [][] scores = new int[3][n];
		
		for (int i = 0; i < n; i++) {
			scores[0][i] = scanner.nextInt();
			scores[1][i] = scanner.nextInt();
			scores[2][i] = scores[0][i]*5 - scores[1][i]*3;
		}
		
		boolean gold = true;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			if (scores[2][i] <= 40)
				gold = false;
			else
				count++;
		}
		
		if (gold) System.out.println(count + "+");
		else System.out.println(count);
		System.out.println(Arrays.toString(scores[2]));
	}
}
