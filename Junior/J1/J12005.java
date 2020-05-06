package J1;

import java.util.Scanner;

public class J12005 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Number of daytime minutes?");
		int daytime = scanner.nextInt();
		System.out.println("Number of evening minutes?");
		int evening = scanner.nextInt();
		System.out.println("Number of weekend minutes?");
		int weekend = scanner.nextInt();
		
		double a = + evening*0.15 + weekend*0.2;
		if (daytime > 100)
			a += (daytime - 100)*0.25;
		double b = + evening*0.35 + weekend*0.25;
		if (daytime > 250)
			b += (daytime - 250)*0.45;
		
		a = Math.round(a * 100.0) / 100.0;
		b = Math.round(b * 100.0) / 100.0;
		
		System.out.println("Plan A costs " + a);
		System.out.println("Plan B costs " + b);
		if (a > b) System.out.println("Plan B is cheapest.");
		if (a < b) System.out.println("Plan A is cheapest.");
		if (a == b) System.out.println("Plan A and B are the same price.");
	}
}
