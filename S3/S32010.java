package S3;

import java.util.Arrays;
import java.util.Scanner;

public class S32010 {
	public static void main (String [] args){
		Scanner scanner = new Scanner (System.in);
		
		int nHouse = scanner.nextInt();
		scanner.nextLine();
		int street [] = new int[nHouse];
		for(int i = 0; i < street.length; i++){
			String temp = scanner.nextLine();
			if (temp.equals("0 "))
				street[i] = 0;
			else
				street[i] = Integer.valueOf(temp);
		}
		
		Arrays.sort(street);
		
		int nHydrants = scanner.nextInt();
		
		if (nHydrants >= nHouse){
			System.out.println("0");
			return;
		}

		for(int length = 1; length < 1000000; length++){
			int hydrants = nHydrants;
			for(int i = 0; i < nHouse; i++){
				hydrants--;
				if (hydrants < 0)
					break; 
				int loc = street[i] + length * 2;
				int progress = 0;
				for(int j = i; j < nHouse; j++){
					if (loc >= street[j]){
						progress++;
					}
				}
				i += progress - 1;
			}
			if (hydrants >= 0){
				System.out.println(length);
				return;	
			}
		}
	}
}