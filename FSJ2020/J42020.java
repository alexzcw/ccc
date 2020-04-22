package FSJ2020;

import java.util.Scanner;

public class J42020 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        String S = scanner.nextLine();
        int length = S.length();
        int blength = T.length();

        int x = 0;
        int y = length;
        boolean fin = false;
        for (int i = 0; i < blength - length + 1; i++) {
            if (IsCyclicWord(S, T.substring(x,y))) {
//                System.out.println(T.substring(x, y));
                fin = true;
            }
            x++;
            y++;
        }
        if (fin)
            System.out.println("yes");
        else
            System.out.println("no");
    }

    public static Boolean IsCyclicWord(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }
}
