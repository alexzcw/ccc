package J3;

import java.util.ArrayList;
import java.util.Scanner;

public class J32010 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        int a = 0;
        int b = 0;
        ArrayList<Character> arr=new ArrayList<Character>();

        String in = scanner.nextLine();
        stringToArray(in, arr);
        while (arr.get(0) != '7') {
            if (arr.get(0) == '1') {
                if (arr.get(1) == 'A')
                    a = Character.getNumericValue(arr.get(2));
                else
                    b = Character.getNumericValue(arr.get(2));
            }
            if (arr.get(0) == '2') {
                if (arr.get(1) == 'A')
                    System.out.println(a);
                else
                    System.out.println(b);
            }
            if (arr.get(0) == '3') {
                if (arr.get(1) == 'A')
                    a = a+b;
                else
                    b = a+b;
            }
            if (arr.get(0) == '4') {
                if (arr.get(1) == 'A')
                    a = a*b;
                else
                    b = a*b;
            }
            if (arr.get(0) == '5') {
                if (arr.get(1) == 'A')
                    a = a-b;
                else
                    b = a-b;
            }
            if (arr.get(0) == '6') {
                if (arr.get(1) == 'A')
                    a = a/b;
                else
                    b = a/b;
            }
            in = scanner.nextLine();
            arr.clear();
            stringToArray(in, arr);
        }
    }
    public static ArrayList<Character> stringToArray (String str, ArrayList<Character> arr) {
        int c = 0;
        for (int r = 0;r < str.length();r+=2) {
            arr.add(c, str.charAt(r));
            c++;
        }
        return arr;
    }
}
