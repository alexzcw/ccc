package ccc2021;

import java.util.Arrays;
import java.util.Scanner;

public class J42021 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		String in = scanner.nextLine();
		int n = in.length();
		int [] books = new int [n];
		int [] shelf = new int [n];
		
		for (int j = 0; j < in.length(); j++) {
			if (in.charAt(j) == 'L') {
				books[n - j - 1] = 3;
				shelf[n - j - 1] = 3;
			} else if (in.charAt(j) == 'M') {
				books[n - j - 1] = 2;
				shelf[n - j - 1] = 2;
			} else {
				books[n - j - 1] = 1;
				shelf[n - j - 1] = 1;
			}
		}
		Arrays.sort(shelf);
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (books[i] == shelf[i])
				count++;
		}
		
		System.out.println(Arrays.toString(books));
		System.out.println(Arrays.toString(shelf));
		System.out.println(count);

		int wrong = n-count;
		if (wrong%2 == 1)
			System.out.println(wrong/2+1);
		else
			System.out.println(wrong/2);
	}
}
