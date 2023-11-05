import java.util.Scanner;

public class S12020 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		int [] time = new int [n];
		int [] pos = new int [n];
		for (int i = 0; i < n; i++) {
			time[i] = scanner.nextInt();
			pos[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < time.length; i++) {     
            for (int j = i+1; j < time.length; j++) {     
               if(time[i] > time[j]) {    
                   int temp = time[i];    
                   time[i] = time[j];    
                   time[j] = temp;
                   temp = pos[i];    
                   pos[i] = pos[j];    
                   pos[j] = temp;
               }     
            }     
        }    
		
		double temp = 0;
		for (int i = 0; i <n-1; i++) {
			double current = (double)(Math.abs(pos[i + 1] - pos[i]))/(Math.abs(time[i + 1] - time[i]));
//			System.out.println(current);
			if (current > temp)
				temp = current;
		}

		System.out.println(temp);
//		System.out.println(Arrays.toString(time) + "\n" + Arrays.toString(pos));
		scanner.close();
	}
}