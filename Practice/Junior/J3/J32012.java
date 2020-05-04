package J3;

import java.util.Scanner;

public class J32012 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        int scale = scanner.nextInt();
        String result = "";
        for (int b = 0; b < scale; b++) {
            for (int a = 0; a < scale; a++)
                result += "*";
            for (int a = 0; a < scale; a++)
                result += "X";
            for (int a = 0; a < scale; a++)
                result += "*";
            result += "\n";
        }
        for (int b = 0; b < scale; b++) {
            for (int a = 0; a < scale; a++)
                result += " ";
            for (int a = 0; a < scale; a++)
                result += "X";
            for (int a = 0; a < scale; a++)
                result += "X";
            result += "\n";
        }
        for (int b = 0; b < scale; b++) {
            for (int a = 0; a < scale; a++)
                result += "*";
            for (int a = 0; a < scale; a++)
                result += " ";
            for (int a = 0; a < scale; a++)
                result += "*";
            result += "\n";
        }

        System.out.println(result);
    }
}
