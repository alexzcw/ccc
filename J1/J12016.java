package J1;

import java.util.Scanner;

public class J12016 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        int w = 0;
        int l = 0;

        for (int i = 0; i < 6; i++) {
            String in = scanner.nextLine();
            if (in.equals("W"))
                w++;
            else
                l++;
        }
        if (w==5 || w==6)
            System.out.println(3);
        else if (w==3 || w==4)
            System.out.println(2);
        else
            System.out.println(1);
    }
}