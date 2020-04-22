package J2;

import java.util.Scanner;

public class J22014 {
    public static int tvote;
    public static int str;

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter total number of votes: ");
        tvote = s.nextInt();
        System.out.println("Enter the vote results: ");
        String str = scanner.nextLine();
        int counta = 0;
        int countb = 0;

        for(int i = 0; i < str.length() - 1; ++i) {
            if (str.substring(i).equals("A")) {
                ++counta;
            }

            if (str.substring(i).equals("B")) {
                ++countb;
            }
        }

        if (counta == countb) {
            System.out.println("Tie");
        }

        if (counta > countb) {
            System.out.println("A");
        }

        if (counta < countb) {
            System.out.println("B");
        }

    }
}
