package J5;

import java.util.Scanner;

public class J52005 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		String out = "";
		while (true) {
			String in = scanner.nextLine();
			if (in.equals("X"))
				break;
			char first = in.charAt(0);
			char last = in.charAt(in.length() - 1);
			
			if (first == 'B' && last == 'S') 
				in = in.substring(1, in.length() - 1);
			
			boolean aindex = true;
			boolean aword = true;
			for (int i = 0; i < in.length() - 1; i++) {
				char current = in.charAt(i);
				if (current == 'A' && aindex)
					aindex = false;
				else if (current == 'N' && !aindex)
					aindex = true;
				else {
					aword = false;
					break;
				}
			}
			
			if (aword) out += "YES\n";
			else out += "NO\n";
		}
		System.out.println(out);

		scanner.close();
	}
}
