package J3;

import java.util.Scanner;

public class J32014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int nRounds = scanner.nextInt();
        int cRound = 1;
        int a = 100;
        int b = 100;
        while (cRound < nRounds) {
            int aDice = scanner.nextInt();
            int bDice = scanner.nextInt();
            int max = aDice > bDice ? aDice : bDice;
            if (aDice == bDice) {
                continue;
            } else {
                if (aDice > bDice)
                    b -= max;
                else
                    a -= max;
            }
            cRound++;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
