package J1;

import java.util.Scanner;

public class J12018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstDigit = in.nextInt();
        int secondDigit = in.nextInt();
        int thirdDigit = in.nextInt();
        int fourthDigit = in.nextInt();
        if ((firstDigit == 8 || firstDigit == 9) && (secondDigit == thirdDigit) && (fourthDigit == 8 || fourthDigit == 9)) {
            System.out.print("ignore");
        } else {
            System.out.print("answer");
        }
    }
}