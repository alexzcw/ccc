package J5;

import java.util.Scanner;

public class J52015 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		
		int pieces = scanner.nextInt();
		int people = scanner.nextInt() - 1;
		int count = 0;
		int n = 1;
		
		for (int j = 0; j < people; j++)
			n = n * 10;
		
		for (int i = n; i < n * 10;i++) {
			int [] arr = intArr(i);
			int sum = 0;
			for (int j = 0; j < arr.length; j++)
				sum += arr[j];
			if (sum == pieces && order(arr))
				count++;
		}
		if (pieces == people || people+1 == 1)
			count = 1;
		System.out.println(count);
	}
	public static int[] intArr (int n) {
		String temp = Integer.toString(n);
		int[] arr = new int [temp.length()];
		
		for (int i = 0; i < temp.length(); i++) {
			arr[i] = Character.getNumericValue(temp.charAt(i));
		}
		return arr;
	}
	public static boolean order (int [] arr) {
		boolean order = true;
		for (int j = 0; j < arr.length - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				order = false;
				break;
			}
		}
		return order;
	}
}
