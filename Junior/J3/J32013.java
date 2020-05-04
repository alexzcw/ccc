package J3;

import java.util.Scanner;

public class J32013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int in = scanner.nextInt() + 1;
        while (true) {
            if (distinctDigits(in))
                break;
            in++;
        }
        System.out.println(in);
    }
    public static boolean distinctDigits(int x) {
        String str = Integer.toString(x);
        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (temp == str.charAt(j))
                    return false;
            }
        }
        return true;
    }
}
