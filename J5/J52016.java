package J5;

import java.util.Arrays;
import java.util.Scanner;

public class J52016 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		int q = scanner.nextInt();
		int n = scanner.nextInt();
		
		int [] arr = new int[n*2];
		for (int i = 0; i < n*2; i++)
			arr[i] = scanner.nextInt();

		Arrays.sort(arr);
		
		int total = 0;
		if (q == 1)	
			for (int i = 1; i < n*2; i+=2)
				total += arr[i];
		else
			for (int i = n; i < n*2; i++)
				total += arr[i];
		System.out.println(total);
	}
}
