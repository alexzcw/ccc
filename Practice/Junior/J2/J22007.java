package J2;

import java.util.Scanner;

public class J22007 {
    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phrase: ");
        String s = scanner.nextLine();
        if (s.equals("CU")) {
            System.out.print("see you");
        }

        if (s.equals(":-)")) {
            System.out.println("I'm happy");
        }

        if (s.equals(":-(")) {
            System.out.println("I'm unhappy");
        }

        if (s.equals(";-)")) {
            System.out.println("wink");
        }

        if (s.equals(":-P")) {
            System.out.println("stick out my tongue");
        }

        if (s.equals("(~.~)")) {
            System.out.println("sleepy");
        }

        if (s.equals("TA")) {
            System.out.println("totally awesome");
        }

        if (s.equals("CCC")) {
            System.out.println("Canadian Computing Competition");
        }

        if (s.equals("CUZ")) {
            System.out.println("because");
        }

        if (s.equals("TY")) {
            System.out.println("thank you");
        }

        if (s.equals("YW")) {
            System.out.println("you're welcome");
        }

        if (s.equals("TTYL")) {
            System.exit(0);
        }

        if (s.equals("")) {
            System.out.println(s);
        }

    }
}
