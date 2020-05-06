package J2;

import java.util.Scanner;

public class J22005 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter lower limit of range");
		int lower = scanner.nextInt();
		System.out.println("Enter upper limit of range");
		int upper = scanner.nextInt();
		
		int ncount = 0;
		for (int i = lower; i <= upper; i++) {
			int count = 1;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 4)
				ncount++;
		}
		System.out.println("The number of RSA numbers between "+lower+" and " + upper+" is " +ncount);
	}
}
