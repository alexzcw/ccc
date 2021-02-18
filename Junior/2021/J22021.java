package ccc2021;

import java.util.Arrays;
import java.util.Scanner;

public class J22021 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		String out = "";
		String memory = "";
		String in = scanner.nextLine();
		while (true) {
			if (in.equals("99999"))
				break;
			int sum = Integer.valueOf(in.charAt(0) - '0') + 
					Integer.valueOf(in.charAt(1) - '0');
			
			if (sum % 2 == 1)
				memory = "left ";
			else if (sum % 2 == 0 && sum != 0)
				memory = "right ";
			
			out += memory + in.substring(2) + "\n";
			in = scanner.nextLine();
		}
		
		System.out.println(out);
	}
}
