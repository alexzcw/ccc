package ccc2021;

import java.util.Arrays;
import java.util.Scanner;

public class J32021 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		String in = scanner.nextLine();
		int [] books = new int [in.length()];
		
		for (int j = 0; j < in.length(); j++) {
			if (in.charAt(j) == 'L') {
				books[in.length() - j - 1] = 3;
			} else if (in.charAt(j) == 'M') {
				books[in.length() - j - 1] = 2;
			} else {
				books[in.length() - j - 1] = 1;
			}
		}
		System.out.println(Arrays.toString(books));
		
		System.out.println(swaps(books));
	}
	static int swaps(int[] arr) {
		int swap=0;
		boolean [] visited = new boolean [arr.length];

		for(int i=0;i<arr.length;i++){
			int j=i,cycle=0;

			while(!visited[j]){
				visited[j]=true;
				j = arr[j]-1;
				cycle++;
				System.out.println(Arrays.toString(visited));
			}
			
			if(cycle!=0)
				swap+=cycle-1;
		}
		return swap;
	}
}
