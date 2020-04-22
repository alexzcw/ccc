package S3;

import java.util.Scanner;

public class S32015 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		
		int g = scanner.nextInt();
		int p = scanner.nextInt();
		int[]arr = new int [g];
		String gate = "";
		String plane = "";	
		
		for (int i = 1; i < p + 1; i++) {
			plane += i;
			gate += scanner.nextInt();
		}
		
		
		int count = 0;
		for (int i = 1; i <= g; i++) {
			for (int j = 0; j < gate.length(); j++) {
				if (Character.getNumericValue((gate.charAt(j))) == i) {
					arr[i - 1] = Character.getNumericValue(plane.charAt(j));
					count++;
					break;
				}
			}
		}
		
//		System.out.println(gate);
//		System.out.println(plane);
//		System.out.println("---");
//		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}
}
