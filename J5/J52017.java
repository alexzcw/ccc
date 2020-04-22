//import java.util.Arrays;
//import java.util.Scanner;
//
//public class J5 {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner (System.in);
//		
//		int n = scanner.nextInt();
//		int[] in = new int [n];
//		for (int p = 0; p < n; p++) {
//			in[p] = scanner.nextInt();
//		}
////		System.out.println(Arrays.toString(in));
//		
//		int [] arr = new int [4000];
//		arr[0] = -1;
//		for (int i = 0; i < n; i++) {
//			for (int j = i+1; j < n; j++) {
//				arr[Integer.valueOf(in[i] + in[j])]++;
//			}
//		}
//		
//		int max = 0;
//		int index = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//				index = i;
//			}
//		}
//		
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == max) {
//				count++;
//			}
//		}
//		
////		System.out.println(Arrays.toString(arr));
//		System.out.println(max + " " + count);
//	}
//}

package J5;

import java.util.Scanner;

public class J52017 {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
//      bucket[i] is the amount of boards with height 'i'
//      sums[i+j] is the possible amount of fence [not board] which the height is i+j
        
        int[] buckets = new int[2001];
        int[] sums = new int[4000];
        
        for(int i = 0; i < N; i++)
            buckets[in.nextInt()]++;
        final long startTime = System.nanoTime();
        
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != 0) {
                for (int j = i; j < buckets.length; j++)
                    sums[i + j - 1] += i == j ? buckets[i] >> 1 : Math.min(buckets[i], buckets[j]);
            }
        }
//        System.out.println(Arrays.toString(sums));
//        System.out.println(Arrays.toString(buckets));
        
        int longest = 0;
        int heights = 0;
        
        for(int i = 0; i < sums.length; i++) {
            if (sums[i] > longest) {
                longest = sums[i];
                heights = 1;
            } else if (sums[i] == longest) {
                heights++;
            }
        }
        final long duration = System.nanoTime();
        System.out.println((duration - startTime)/1000000000 + "." + (duration - startTime)/1000000);
        System.out.println(longest + " " + heights);
        
    }
}