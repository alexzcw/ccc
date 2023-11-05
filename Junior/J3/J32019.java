package J3;

import java.util.Scanner;

public class J32019 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		scanner.nextLine();
		String out = "";
		
		for (int z = 0; z < n; z++) {
			String str = scanner.nextLine();
			char temp = str.charAt(0);
			int count  = 0;
			
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == temp)
					count++;
				else {
					out += count + " " + temp + " ";
					temp = str.charAt(i);
					count = 1;
				}
			}
			out += count + " " + temp + " \n";
		}
		System.out.println(out);
	}
}
