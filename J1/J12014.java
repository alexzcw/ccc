package J1;

import java.util.Scanner;

public class J12014 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if (a == b && b == c)
            System.out.println("Equilateral");
        else if (a == b || b == c || c == a)
            System.out.println("Isosceles");
        else if (a != b && b != c && c != a)
            System.out.println("Scalene");
        else
            System.out.println("Error");
    }
}