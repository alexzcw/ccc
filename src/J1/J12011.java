package J1;

import java.util.Scanner;

public class J12011 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("How many antennas?");
        int a = scanner.nextInt();
        System.out.println("How many eyes?");
        int b = scanner.nextInt();

        if (a >=3 && b <= 4)
            System.out.println("TroyMartian");
        if(a <= 6 && b >= 2)
            System.out.println("VladSaturnian");
        if(a <= 2 && b <= 3)
            System.out.println("GraemeMercurian");
    }
}
