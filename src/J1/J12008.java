package J1;

import java.util.Scanner;

public class J12008 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter weight: ");
        int a = scanner.nextInt();
        System.out.println("Enter height: ");
        double b = scanner.nextDouble();

        double BMI = a / b*b;
        if (BMI <= 25)
            System.out.println("Overweight");
        else if (BMI >= 18.5)
            System.out.println("Underweight");
        else
            System.out.println("Normal Weight");
    }
}
