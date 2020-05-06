package J4;

import java.util.Scanner;

public class J42019 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		String none = "1 2\n3 4";
		String H = "3 4\n1 2";
		String V = "2 1\n4 3";
		String HV = "4 3\n2 1";
		
		String str = scanner.nextLine();
		int vcount = 0; 
		int hcount = 0;
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) == 'V')
				vcount++;
			else
				hcount++;
		}
		vcount %= 2;
		hcount %= 2;
		if (vcount == 1 && hcount == 0)
			System.out.println(V);
		if (vcount == 0 && hcount == 1)
			System.out.println(H);
		if (vcount == 0 && hcount == 0)
			System.out.println(none);
		else
			System.out.println(HV);
		
	}
}
