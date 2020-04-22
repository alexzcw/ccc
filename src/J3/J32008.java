package J3;

import java.util.Scanner;

public class J32008 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        Character[][] gps = new Character[][] {
                {'A','B','C','D','E','F'},
                {'G','H','I','J','K','L'},
                {'M','N','O','P','Q','R'},
                {'S','T','U','V','W','X'},
                {'Y','Z',' ','.','.','~'}
        };
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int count = 0;
        String in = 'A'+scanner.nextLine();
        int p = 0;
        while (p < in.length() - 1) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
                    if (gps[i][j] == in.charAt(p)) {
                        x1 = i;
                        y1 = j;
                    }
                }
            }
            p++;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
                    if (gps[i][j] == in.charAt(p)) {
                        x2 = i;
                        y2 = j;
                    }
                }
            }
            count += Math.abs(x1 - x2) + Math.abs(y1 - y2);
        }
        count += Math.abs(x2 - 4) + Math.abs(y2 - 5);
        System.out.println(count);
    }
}
