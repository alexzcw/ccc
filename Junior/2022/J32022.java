package ccc2022;

import java.io.*;
import java.util.*;

public class J32022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String in = scanner.nextLine();
		String out = "";
		
		
		int j;
		int mem = 0;
		for (int i = 0; i < in.length(); i++) {
			String temp = "";
			if (in.charAt(i) == '+') {
				
				for (j = i+1; j < in.length(); j++) {
					if (in.charAt(j) == '1' ||
							in.charAt(j) == '2' ||
							in.charAt(j) == '3' ||
							in.charAt(j) == '4' ||
							in.charAt(j) == '5' ||
							in.charAt(j) == '6' ||
							in.charAt(j) == '7' ||
							in.charAt(j) == '8' ||
							in.charAt(j) == '9' ||
							in.charAt(j) == '0')
						temp += in.charAt(j);
					else break;
				}
				out += in.substring(mem, i) + " tighten " + temp + "\n";
				mem = j;
			} 
			
			if (in.charAt(i) == '-') {
				for (j = i+1; j < in.length(); j++) {
					if (in.charAt(j) == '1' ||
							in.charAt(j) == '2' ||
							in.charAt(j) == '3' ||
							in.charAt(j) == '4' ||
							in.charAt(j) == '5' ||
							in.charAt(j) == '6' ||
							in.charAt(j) == '7' ||
							in.charAt(j) == '8' ||
							in.charAt(j) == '9' ||
							in.charAt(j) == '0')
						temp += in.charAt(j);
					else break;
				}
				out += in.substring(mem, i) + " loosen " + temp + "\n";
				mem = j;
			}
		}
		out = out.substring(0, out.length() - 1);
		System.out.println(out);
	}
}
