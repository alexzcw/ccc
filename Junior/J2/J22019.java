package J2;

import java.util.Scanner;

public class J22019 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		String out = "";
		for (int z = 0; z < n; z++) {
			n = scanner.nextInt();
			String print = scanner.next();
			for (int i = 0; i < n; i++) {
				out += print;
			}
			out += "\n";
		}
		System.out.println(out);
	}
}
