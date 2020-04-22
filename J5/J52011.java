package J5;

import java.util.Arrays;
import java.util.Scanner;

public class J52011 {
//	public static void main (String [] args) {
//		Scanner scanner = new Scanner (System.in);
//		int n = scanner.nextInt();
//		String [] comb = new String [(int) Math.pow(2, n)];
//		String freinds = "";
//		String invited = "";
//		
//		for (int i = 1; i < n; i++) {
//			freinds += i;
//			invited += scanner.nextInt();
//		}
//		for (int i = 0; i < Math.pow(2, n); i++) {
//		    String bin = Integer.toBinaryString(i);
//		    while (bin.length() < n)
//		        bin = "0" + bin;
//		    comb[i] = bin;
//		}
//		
//		int [] single = new int [n];
//		for (int i = 0; i < Math.pow(2, n); i++) {
//			String temp = comb[i];
//			for (int j = 0; j < n; j++) {
//				single[j] = temp.charAt(j);
//			}
//			
//		}
//		
//		System.out.println(Arrays.toString(comb));
//		System.out.println("--");
//		System.out.println(freinds);
//		System.out.println(invited);
//	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] friends = new int[N];
        Arrays.fill(friends, 1);
        
        for (int j = 0; j < N - 1; j++) {
            friends[in.nextInt() - 1] *= 1 + friends[j]; 
        }
        System.out.println(friends[N - 1]);
    }
}
