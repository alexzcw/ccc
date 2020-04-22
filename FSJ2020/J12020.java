package FSJ2020;

import java.util.Scanner;

public class J12020 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        int x = s + 2*m + 3*l;

        if (x >= 10)
            System.out.println("happy");
        else
            System.out.println("sad");
    }
}
