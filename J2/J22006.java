package J2;

import java.util.Scanner;

public class J22006 {
    public static int n;
    public static int m;

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the value of M: ");
        m = s.nextInt();
        System.out.println("Please enter the value of N: ");
        n = s.nextInt();
        int min = m > n ? m : n;
        int max = m < n ? m : n;
        int count = 0;

        for(int j = 0; j < max; ++j) {
            for(int i = 0; i < min; ++i) {
                if (i + j == 10) {
                    ++count;
                }
            }
        }

        if (m + n > 9) {
            ++count;
        }

        if (count == 1) {
            System.out.println("There is 1 way to get the 10 as the sum.");
        } else {
            System.out.println("There are " + count + " ways to get 10 as the sum");
        }

    }
}
