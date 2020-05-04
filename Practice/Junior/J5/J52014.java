package J5;

import java.util.Scanner;

public class J52014 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		scanner.nextLine();
		String one = scanner.nextLine();
		String two = scanner.nextLine();
		
		String[] names = one.split(" ");
		String[] names2 = two.split(" ");
		
		boolean order = true;
		for (int i = 0; i < n; i++) {
			String temp = names[i];
			String temp2 = names2[i];
			for (int j = 0; j < n; j++) {
				if (names2[j].equals(temp) && !(names[j].equals(temp2))) {
					order = false;
					break;
				}
			}
			if (!order)
				break;
		}
		if (order) {
			for (int i = 0; i < n; i++) {
				if (names[i].equals(names2[i])) {
					order = false;
					break;
				}
			}
		}

		if (order)
			System.out.println("good");
		else
			System.out.println("bad");
	}
}
