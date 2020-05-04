package J2;

import java.util.Scanner;

public class J22010 {
    public static int nicky;
    public static int bryon;

    public J22010() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter how many steps Nicky takes forward: ");
        int n1 = s.nextInt();
        System.out.println("Please enter how many steps Nicky takes backward: ");
        int b1 = s.nextInt();
        System.out.println("Please enter how mnay steps Bryon takes forward: ");
        int n2 = s.nextInt();
        System.out.println("Please enter how many steps Bryon takes backward: ");
        int b2 = s.nextInt();
        System.out.println("Please enter the total number of steps: ");
        int steps = s.nextInt();

        int b;
        for(b = 0; b < steps; ++b) {
            nicky += n1 - n2;
        }

        for(b = 0; b < steps; ++b) {
            bryon += b1 - b2;
        }

        if (nicky == bryon) {
            System.out.println("Tied");
        }

        if (nicky > bryon) {
            System.out.println("Nicky");
        }

        if (nicky < bryon) {
            System.out.println("Bryon");
        }

    }
}
