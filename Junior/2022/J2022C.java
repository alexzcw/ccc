package ccc2022;

import java.util.Arrays;
import java.util.Scanner;

public class J2022C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		
		int [] x = new int [t];
		int [] y = new int [t];
		for (int i = 0; i < t; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}

		Arrays.sort(x);
		Arrays.sort(y);
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
		int maxAdjDiff = 0;
		for (int i = 0; i < t-1; i++) {
			if (x[i+1] - x[i] > maxAdjDiff)
				maxAdjDiff = x[i+1] - x[i];
		}
		
		System.out.println(maxAdjDiff);
	}
}
