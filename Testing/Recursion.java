package Testing;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            System.out.println(recursion(n));
        }

    }
    public static int recursion (int n) {
        if (n<=2) {
            return 1;
        }
        else {
            return recursion (n-1) + recursion(n-2);
        }
    }
}
