package J4;

import java.util.Scanner;

public class J42017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int departure = scanner.nextInt();

        int numTime = 1200;
        int i = 0;
        int count = 0;
        while (i <= departure) {
            int a = 0;;
            int b = 0;
            int c = 0;
            int d = 0;
            int differ = 0;
            if (numTime > 1259) {
                numTime = 100;
            } else if (numTime % 100 > 59) {
                numTime = numTime / 100 * 100 + 100;
            }

            String str = Integer.toString(numTime);
            a = Integer.valueOf(str.charAt(0));
            b = Integer.valueOf(str.charAt(1));
            c = Integer.valueOf(str.charAt(2));
            differ = a - b;
            if (str.length() == 4) {
                d = Integer.valueOf(str.charAt(3));
                if (b - c == c - d && c - d == differ) {
                    count++;
                }
            } else {
                if (b - c  == differ) {
                    count++;
                }
            }
            numTime++;
            i++;
        }
        System.out.println(count);
    }
}
