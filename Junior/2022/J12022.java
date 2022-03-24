package ccc2022;

import java.io.*;
import java.util.*;

public class J12022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int r = scanner.nextInt();
		int s = scanner.nextInt();
		
		int n = r*8 + s*3 - 28;
		if (n < 0) n = 0;
		
		System.out.println(n);
	}
}
