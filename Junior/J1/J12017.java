package J1;

import java.util.Scanner;

public class J12017 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x >= 0 && y >= 0)
            System.out.println(1);
        if(x <= 0 && y>= 0)
            System.out.println(2);
        if(x <= 0 && y <= 0)
            System.out.println(3);
        if (x >= 0 && y <= 0)
            System.out.println(4);
    }
}