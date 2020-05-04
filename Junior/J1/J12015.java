package J1;

import java.util.Scanner;

public class J12015 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();

        if (month < 2 || month == 2 && day < 18)
            System.out.println("Before");
        else if (month == 2 && day == 18)
            System.out.println("Special");
        else
            System.out.println("After");
    }
}
