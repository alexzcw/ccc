package ccc2022;

import java.io.*;
import java.util.*;

public class J42022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int x = scanner.nextInt();
		scanner.nextLine();
		String [][] same = new String [x][2];
		for (int i = 0; i < x; i++)
			same[i] = scanner.nextLine().split(" ");
		
		int y = scanner.nextInt();
		scanner.nextLine();
		String [][] diff = new String [y][2];
		for (int i = 0; i < y; i++) 
			diff[i] = scanner.nextLine().split(" ");
		
		int g = scanner.nextInt();
		scanner.nextLine();
		String [][] grouped = new String [g][3];
		for (int i = 0; i < g; i++) 
			grouped[i] = scanner.nextLine().split(" ");
		
		int violated = 0;
	
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < g; j++) {
				if (grouped[j][0].equals(same[i][0]) ||
					grouped[j][1].equals(same[i][0]) ||
					grouped[j][2].equals(same[i][0])) {
					if (!(grouped[j][0].equals(same[i][1]) ||
					grouped[j][1].equals(same[i][1]) ||
					grouped[j][2].equals(same[i][1]))) {
						violated++;
						break;
					}
				}
				if (grouped[j][0].equals(same[i][1]) ||
					grouped[j][1].equals(same[i][1]) ||
					grouped[j][2].equals(same[i][1])) {
					if (!(grouped[j][0].equals(same[i][0]) ||
					grouped[j][1].equals(same[i][0]) ||
					grouped[j][2].equals(same[i][0]))) {
						violated++;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < g; j++) {
				if (grouped[j][0].equals(diff[i][0]) ||
					grouped[j][1].equals(diff[i][0]) ||
					grouped[j][2].equals(diff[i][0])) {
					if ((grouped[j][0].equals(diff[i][1]) ||
					grouped[j][1].equals(diff[i][1]) ||
					grouped[j][2].equals(diff[i][1]))) {
						violated++;
						break;
					}
				}
				if (grouped[j][0].equals(diff[i][1]) ||
					grouped[j][1].equals(diff[i][1]) ||
					grouped[j][2].equals(diff[i][1])) {
					if ((grouped[j][0].equals(diff[i][0]) ||
					grouped[j][1].equals(diff[i][0]) ||
					grouped[j][2].equals(diff[i][0]))) {
						violated++;
						break;
					}
				}
			}
		}
		
		System.out.println(violated);
	}
}
