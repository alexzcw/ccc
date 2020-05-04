package S3;

import java.util.Scanner;

public class S32014 {
	public static String one = "";
	public static String two = "";
	public static String hold = "";
	public static String perfect = "";
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		String out = "";
		int ntests = scanner.nextInt();
		for (int y = 0; y < ntests; y++) {
			int n = scanner.nextInt();
	
			for (int i = 1; i <= n; i++)
				perfect += i;
			for (int i = 0; i < n; i++)
				one += (scanner.nextInt());
			
			for (int z = 0; z < n; z++) {
				for (int c = 0; c < n + 1; c++) {
					for (int i = one.length() - 1; i > -1; i++) {
	//					System.out.println("---");
	//					System.out.println("one: " + one);
	//					System.out.println("two: " + two);
	//					System.out.println("hold: " + hold);
						if (!one.isEmpty() && last(one) == c + 1) {
							two += last(one);
							one = remove(one);
							break;
						} else if (!hold.isEmpty() && last(hold) == c + 1) {
							two += last(hold);
							hold = remove(hold);
							break;
						} else {
							hold += last(one);
							one = remove(one);
						}
						
						if (one.isEmpty()) {
							one = hold;
							hold = "";
							break;
						}	
						if (two.equals(perfect))
							break;
					}
				}
				if (!(two.equals(perfect))) {
					one = hold;
					hold = "";
				} else
					break;
			}
			if (two.equals(perfect))
				out += "Y";
			else
				out += "N";
			out += "\n";
		}
		System.out.println(out);
	}
	public static String remove (String x) {
		if (x.length() == 0)
			return x;
		else {
			x = x.substring(0, x.length() - 1);
			return x;
		}
	}
	public static int last (String x) {
		int temp = Character.getNumericValue(x.charAt(x.length() - 1));
		return temp;
	}
}