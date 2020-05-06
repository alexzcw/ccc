package J1;

import java.util.Scanner;

public class J12019 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		int a3 = scanner.nextInt() * 3;
		int a2 = scanner.nextInt() * 2;
		int a1 = scanner.nextInt() * 1;
		int b3 = scanner.nextInt() * 3;
		int b2 = scanner.nextInt() * 2;
		int b1 = scanner.nextInt() * 1;
		
		int a = a3 + a2 + a1;
		int b = b3 + b2 + b1;
		if (a > b) System.out.println("A");
		if (a < b) System.out.println("B");
		if (a == b) System.out.println("T");
	}
}
