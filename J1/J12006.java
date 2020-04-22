package J1;

import java.util.Scanner;

public class J12006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Chip’s Fast Food Emporium");
        System.out.print("Please enter a burger choice: ");
        int a = scanner.nextInt();
        System.out.print("Please enter a side order choice: ");
        int b = scanner.nextInt();
        System.out.print("Please enter a drink choice: ");
        int c = scanner.nextInt();
        System.out.print("Please enter a dessert choice: ");
        int d = scanner.nextInt();
        int count = 0;
        if (a == 1)
            count += 461;
        if (a == 2)
            count += 431;
        if (a == 3)
            count += 420;
        if (b == 1)
            count += 130;
        if (b == 2)
            count += 160;
        if (b == 3)
            count += 118;
        if (c == 1)
            count += 100;
        if (c == 2)
            count += 57;
        if (c == 3)
            count += 70;
        if (d == 1)
            count += 167;
        if (d == 2)
            count += 266;
        if (d == 3)
            count += 75;

        System.out.println("Your total Calorie count is " + count + ".");
    }
}
