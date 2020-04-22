package J2;

import java.util.Scanner;

public class J22018 {
    public static int tspaces;
    static String temp;

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total number of car spaces: ");
        tspaces = s.nextInt();
        System.out.println("Enter yesterday's results: ");
        String y = scanner.nextLine();
        System.out.println("Enter today's results: ");
        String t = scanner.nextLine();
        int count = 0;

        for(int i = 0; i < tspaces; ++i) {
            if (y.substring(i, i + 1).equals(t.substring(i, i + 1))) {
                ++count;
            }
        }

        System.out.println(count);
    }
}
