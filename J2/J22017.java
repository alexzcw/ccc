package J2;

import java.util.Scanner;

public class J22017 {
    public static int N;
    public static int k;

    public J22017() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the base number: ");
        N = s.nextInt();
        System.out.println("Please enter number of times you are shifting: ");
        k = s.nextInt();
        int total = N;

        for(int i = 1; i <= k; ++i) {
            int temp = (int)((double)N * Math.pow(10.0D, (double)i));
            total += temp;
        }

        System.out.println(total);
    }
}
