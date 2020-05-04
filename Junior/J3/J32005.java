package J3;

import java.util.Scanner;

public class J32005 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        String in = scanner.nextLine();
        String out = "";
        String[] arr = new String [2];
        boolean exit = false;
        while (!exit) {
            String str = "";
            arr[0] = in;
            in = scanner.nextLine();
            arr[1] = in;

            if (arr[0].equals("R"))
                str += "Turn LEFT ";
            else
                str += "Turn RIGHT ";
            if (arr[1].equals("SCHOOL")) {
                str += "into your HOME.";
                exit = true;
                out += str;
                break;
            }
            else
                str += "onto " +arr[1] + " street.";
            out = str + "\n" + out;
            in = scanner.nextLine();
        }
        System.out.println(out);
    }
}
