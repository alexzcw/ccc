package S3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S32012 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		
		Map<Integer, Integer> map = new HashMap<>();
        for (int key : arr) {
            if (map.containsKey(key)) {
                int occurrence = map.get(key);
                occurrence++;
                map.put(key, occurrence);
            } else {
                map.put(key, 1);
            }
        }
        
        String num = "";
        String occ = "";
        int count = 0;
        for (Integer key : map.keySet()) {
            int occurrence = map.get(key);
            num += key;
            occ += occurrence;
        }
        
        int most1 = Character.getNumericValue(occ.charAt(0));
        int most2 = 0;;
        for (int i = 1; i < occ.length(); i++) {
        	if (i != most1) {
        		most2 = Character.getNumericValue(occ.charAt(i));
        		break;
        	}
        }
		
        int max1 = Character.getNumericValue(num.charAt(0));
        int max2 = 0;
        for (int i = 0; i < occ.length(); i++) {
        	if (Character.getNumericValue(occ.charAt(i)) == most1
        		&& Character.getNumericValue(num.charAt(i)) > max1)
        		max1 = Character.getNumericValue(num.charAt(i));
        }
        for (int i = 1; i < occ.length(); i++) {
        	if (Character.getNumericValue(occ.charAt(i)) == most2
        		&& Character.getNumericValue(num.charAt(i)) > max2)
        		max2 = Character.getNumericValue(num.charAt(i));
        }
        
        
        System.out.println(Math.abs(max1 - max2));
//        System.out.println("---");
//        System.out.println(max1);
//        System.out.println(max2);
//        System.out.println(most1);
//        System.out.println(most2);
//        System.out.println("---");
//        System.out.println(num);
//        System.out.println(occ);
//		System.out.println(Arrays.toString(arr));
	}
}
