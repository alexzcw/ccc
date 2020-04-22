package J2;

import java.util.Scanner;

public class J22011 {
    public static int M;
    public static int h;

    public J22011() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the current humidity of the air: ");
        h = s.nextInt();
        System.out.println("Please enter the Maximum waiting time: ");
        M = s.nextInt();
        int t = 1;

        int A;
        for(A = -6 * t * t * t * t + h * t * t * t + 2 * t * t + t; t < M && A > 0; A = -6 * t * t * t * t + h * t * t * t + 2 * t * t + t) {
            ++t;
        }

        if (A > 0) {
            System.out.println("The balloon does not touch ground in the given time.");
        } else {
            System.out.println("The balloon touches ground at hour: " + t);
        }

    }
}
