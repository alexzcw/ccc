package ccc2022;

import java.util.Arrays;
import java.util.Scanner;

public class J52022D {
	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		
		int [] x = new int [t+4];
		int [] y = new int [t+4];
		x[0] = 0;
		x[1] = 0;
		x[2] = 4;
		x[3] = 4;
		y[0] = 0;
		y[1] = 4;
		y[2] = 0;
		y[3] = 4;
		for (int i = 4; i < t+4; i++) {
			x[i] = scanner.nextInt()-1;
			y[i] = scanner.nextInt()-1;
		}
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
		int maxX = n-1;
		int maxY = n-1;
		
		for (int i = 0; i < t+4; i++) {
			for (int j = i+1; j < t+4; j++) {
				for (int a = j+1; a < t+4; a++) {
					for (int b = a+1; b < t+4; b++) {
						int [] fourx = {x[i], x[j], x[a], x[b]};
						int [] foury = {y[i], y[j], y[a], y[b]};
						
						System.out.println(Arrays.toString(fourx));
						System.out.println(Arrays.toString(foury));
						Arrays.sort(fourx);
						Arrays.sort(foury);
						
						System.out.println(Arrays.toString(fourx));
						System.out.println(Arrays.toString(foury));
						
						int dx = fourx[3] - fourx[0];
						int dy = foury[3] - foury[0];
						
						System.out.println("dx dy: " + dx + " " + dy);
						
						if (dx < maxX) maxX = dx;
						if (dy < maxY) maxY = dy;
					}
				}
			}
		}
		
		System.out.println(maxX + " " + maxY);
	}
}
