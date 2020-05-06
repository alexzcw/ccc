package J3;

import java.util.Arrays;
import java.util.Scanner;

public class J32020 {
    public static void main (String [] args) {
        Scanner scanner=new Scanner(System.in);
        int p = scanner.nextInt();
        scanner.nextLine();
        int [] arr1 = new int [p];
        int [] arr2 = new int [p];

        for (int i = 0; i < p; i++) {
            int x, y;
            String line;
            String[] lineVector;
            line = scanner.nextLine();

            lineVector = line.split(",");

            x = Integer.parseInt(lineVector[0]);
            y = Integer.parseInt(lineVector[1]);

            arr1[i] = x;
            arr2[i] = y;
        }

        int max1 = arr1[0];
        for (int i = 1; i < arr1.length; i++)
            if (arr1[i] > max1)
                max1 = arr1[i];
//        System.out.println(max1);

        int max2 = arr2[0];
        for (int i = 1; i < arr2.length; i++)
            if (arr2[i] > max2)
                max2 = arr2[i];
//        System.out.println(max2);

        int min1 = arr1[0];
        for (int i = 1; i < arr1.length; i++)
            if (arr1[i] < min1)
                min1 = arr1[i];
//        System.out.println(min1);

        int min2 = arr2[0];
        for (int i = 1; i < arr2.length; i++)
            if (arr2[i] < min2)
                min2 = arr2[i];
//        System.out.println(min2);

//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        System.out.println((min1-1) + ","+(min2-1));
        System.out.println((max1+1) + ","+(max2+1));
    }
}