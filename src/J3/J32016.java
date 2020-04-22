package J3;

import java.util.Scanner;

public class J32016 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine();
        System.out.println(maxMirror(str));
    }
    public static int maxMirror(String str) {
        int max = 0;

        for(int start = 0; start < str.length(); start++) {
            for(int begin = str.length() - 1; begin >= 0; begin--) {
                int size = 0;
                int i = start;
                int j = begin;

                while(i < str.length() && j >= 0 && str.charAt(i) == str.charAt(j)) {
                    size++;
                    i++;
                    j--;
                }

                max = Math.max(max, size);
            }
        }
        return max;
    }
}
