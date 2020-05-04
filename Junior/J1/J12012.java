package J1;

import java.util.Scanner;

public class J12012 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the speed limit: ");
        int limit = scanner.nextInt();
        System.out.println("Enter the recorded speed of the car: ");
        int speed = scanner.nextInt();

        if (speed <= limit)
            System.out.println("Congratulations, you are within the speed limit!");
        else if (limit - speed <= 20)
            System.out.println("You are speeding and your fine is $100.");
        else if (limit - speed <= 30)
            System.out.println("You are speeding and your fine is $270.");
        else
            System.out.println("You are speeding and your fine is $500.");
    }
}
