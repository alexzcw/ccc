package J2;

import java.util.Arrays;
import java.util.Scanner;

public class J22008 {
    public static int p;
    static String temp;

    public J22008() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your button number: ");
        String b = scanner.nextLine();
        System.out.println("Enter your number of presses: ");
        p = s.nextInt();
        String[] button = new String[]{"A", "B", "C", "D", "E"};
        int x;
        String last;
        int i;
        if (b.equals("1")) {
            for(x = 0; x < p; ++x) {
                last = button[0];

                for(i = 0; i < button.length - 1; ++i) {
                    button[i] = button[i + 1];
                }

                button[4] = last;
            }
        }

        if (b.equals("2")) {
            for(x = 0; x < p; ++x) {
                last = button[button.length - 1];
                if (button.length > 1) {
                    for(i = button.length - 2; i >= 0; --i) {
                        button[i + 1] = button[i];
                    }
                }

                button[0] = last;
            }
        }

        if (b.equals("3")) {
            for(x = 0; x < p; ++x) {
                J22008.temp = button[0];
                button[0] = button[4];
                button[4] = J22008.temp;
            }
        }

        System.out.println(Arrays.toString(button));
    }
}