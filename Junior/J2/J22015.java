package J2;

import java.util.Scanner;

public class J22015 {
    public J22015() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the emoticons: ");
        String str = scanner.nextLine();
        int counth = 0;
        int counts = 0;

        for(int i = 0; i < str.length() - 2; ++i) {
            if (str.substring(i, i + 3).equals(":-)")) {
                ++counth;
            }

            if (str.substring(i, i + 3).equals(":-(")) {
                ++counts;
            }
        }

        if (counth == counts && counth != 0 && counts != 0) {
            System.out.println("unsure");
        }

        if (counth > counts) {
            System.out.println("Happy");
        }

        if (counth < counts) {
            System.out.println("Sad");
        }

        if (counth == 0 && counts == 0) {
            System.out.println("none");
        }

    }
}
