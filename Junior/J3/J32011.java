package J3;

import java.util.Scanner;

public class J32011 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int next = first - second;
        int count = 0;

        while (second > next) {
            first = second;
            second = next;;
            next = first - second;
            count++;
        }
        System.out.println(count + 3);
    }
}
