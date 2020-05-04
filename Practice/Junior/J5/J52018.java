package J5;

import java.util.Scanner;

public class J52018 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in); 

		int n = scanner.nextInt();
		String data = "";
		String pagenum = "";
		String noReach = "";
		
		int endPage = 0;
		for (int j = 1; j < n + 1; j++) {
			int temp = scanner.nextInt();
			if(temp == 0)
				endPage = j;
			for (int i = 0; i < temp; i++) {
				data += scanner.nextInt();
				pagenum += j;
			}
		}
		
		boolean backTo1;
		int min = n;
		
		for (int j = n; j > 1; j--) {
			int count = 1;
		    int findingpage = j;
		    backTo1 = false;
		    for (int i = data.length()-1; i > -1; i--) {
		    	if(Character.getNumericValue(data.charAt(i)) == findingpage)
		    		findingpage = Character.getNumericValue(pagenum.charAt(i));
		    	count++;
		    	if (count < min)
		    		min = count;
		    	if (findingpage == 1) {
		    		backTo1 = true;
		    		break;
		    	}
		    }
		    if (backTo1 == false) {
		    	noReach += j;
		    }
		}
		
		if (noReach.equals(""))
			System.out.println("Y");
		else
			System.out.println("N");
		System.out.println(min);
	}
}