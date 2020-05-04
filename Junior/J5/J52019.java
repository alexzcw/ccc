package j5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J52019 {
	public static String current;
	public static String finished;
	public static String [][] rules = new String [3][2];
	public static int count = 0;
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		for (int i = 0; i < 3; i++) 
			for (int j = 0; j < 2; j++) 
				rules [i][j] = scanner.next();
		int moves = scanner.nextInt();
		current = scanner.next();
		finished = scanner.next();
		

		sub(0);
	}
	public static void sub (int pos) {
		if (current.equals(finished))
			return;

		for (int i = 0; i < 3; i++) {
			
			if (pos + rules[i][0].length() <= current.length()) {
				if (rules[i][0].equals(current.substring(pos, pos + rules[i][0].length()))) {
					current = current.substring(0, pos) + rules[i][1] + current.substring(pos + rules[i][1].length() + 1);

					System.out.println((i+1) + " " + (pos+1) + " " + current);
					
					if (pos + rules[0][1].length() >= current.length() || 
						pos + rules[1][1].length() >= current.length() ||
						pos + rules[2][1].length() >= current.length() )
						sub(pos);
					else {
//						System.out.println(pos + rules[i][1].length() + 1);
						sub(pos + rules[i][1].length());
					}

				}
			}
			
		}
		
	}
}
