package J1;

import java.util.Scanner;

public class J12007 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && b > c || c > b && b > a)
            System.out.println(b);
        if (a > c && c > b || b > c && c > a)
            System.out.println(c);
        if (b > a && a > c || c > a && a > b)
            System.out.println(a);
    }
}
