package J2;

import java.util.Scanner;

public class J22020 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int n = scanner.nextInt();
        int r =scanner.nextInt();
        int current = n;
        int total = 0;

        int count = 0;
        while (true) {
            total += current;
//            System.out.println(current);
//            System.out.println(total);
            if (total > p)
                break;
            else {
                if (r == 1) {
                    current = n;
                    count++;
                }
                else{
                    current = current * r;
                    count++;
                }
            }
        }
        if (p == n)
            System.out.println(1);
        else
            System.out.println(count);
        scanner.close();
    }
}