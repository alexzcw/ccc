package J2;

import java.util.Scanner;

public class J22013 {
    public static int p;
    static String temp;

    public J22013() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str = scanner.nextLine();
        boolean one80 = false;
        int i = 0;
        if (i < str.length()) {
            if (str.substring(i, i + 1).equals("I")) {
                one80 = true;
            } else if (str.substring(i, i + 1).equals("O")) {
                one80 = true;
            } else if (str.substring(i, i + 1).equals("S")) {
                one80 = true;
            } else if (str.substring(i, i + 1).equals("H")) {
                one80 = true;
            } else if (str.substring(i, i + 1).equals("Z")) {
                one80 = true;
            } else if (str.substring(i, i + 1).equals("X")) {
                one80 = true;
            } else if (str.substring(i, i + 1).equals("N")) {
                one80 = true;
            } else {
                one80 = false;
            }
        }

        if (one80) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}