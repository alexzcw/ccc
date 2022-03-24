package ccc2022;

import java.io.*;
import java.util.*;

public class helper {
	public static void main(String[] args) throws IOException {
		// replace() replaceFirst()
		String str3 = "hi bob";
		System.out.println(str3.replace("b", "alice"));
		
		// Arraylist
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.clear();
		boolean hi = languages.contains("Java");
		languages.get(0);
		languages.indexOf("Java");
		languages.remove(0);
		languages.remove("Java");
		languages.size();
		languages.set(0, "bruh");
		
		Scanner in = new Scanner (System.in);
		int option = in.nextInt();
		in.nextLine();  // Consume newline left-over
		String str1 = in.nextLine();
		
		// buffer reader
		BufferedReader scanner = new BufferedReader (new InputStreamReader(System.in));
		String inp = scanner.readLine();
		int n = Integer.valueOf(scanner.readLine());
		
		// trim()
		
		// startsWith() endsWith()
		
		// charAt()
		int c = Character.getNumericValue(in.charAt(2));
		
		// equals() vs equalsIgnoreCase()
		
		// split()
		String text = "Java is a fun programming language";
	    String[] result = text.split(" ");
	    System.out.println(Arrays.toString(result));
	    
	    // join()
	    String str12 = "I";
	    String str22 = "love";
	    String str32 = "Java";
	    String joinedStr = String.join(" ", str12, str22, str32);
		
	    // compareTo()
	    String str1 = "Learn Java";
	    String str2 = "Learn Kolin";
	    System.out.println(str1.compareTo(str2));
	    
	    // contains()
	    System.out.println(str1.contains("Java"));
	    
	    // for each
		int [] array = {1, 2, 3, 4};
		for (int i : array)
			System.out.println(i + " ");
		
		// 2d matrix
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		arr = rotateCW(arr);
		arr = rotateCCW(arr);
		print(arr);
		
		// toCharArray()
		
		//timer
		final long startTime = System.nanoTime();
		final long duration = System.nanoTime();
        System.out.println((duration - startTime)/1000000000 + "." + (duration - startTime)/1000000);
	}
	
	private static void occurences (int [] a) {
		HashSet<Integer> al = new HashSet<Integer>();

	    for(int i=0;i<a.length;i++){
	        al.add(a[i]);
	    }

	    System.out.println("al "+al);

	    for(int set : al){
	        int count = 0;
	        for(int j=0;j<a.length;j++){

	            if(set==a[j]){
	                count++;
	            }
	        }
	        System.out.println(set+" occurs "+count+" times");
	    }
	}
	
	private static void print (int[][] arr) {
		for (int[] x : arr) {
			for (int y : x)
				System.out.print(y + " ");
			System.out.println();
		}
	}
	
	private static int[][] rotateCW (int[][] matrix) {
		 int size = matrix.length;
		 int[][] ret = new int[size][size];

		 for (int i = 0; i < size; ++i) 
			 for (int j = 0; j < size; ++j) 
				 ret[i][j] = matrix[size - j - 1][i];

		 return ret;
	}
	
	private static int[][] rotateCCW (int[][] matrix) {
		 int size = matrix.length;
		 int[][] ret = new int[size][size];

		 for (int i = 0; i < size; ++i) 
			 for (int j = 0; j < size; ++j) 
				 ret[i][j] = matrix[j][size - i - 1];

		 return ret;
	}
}
