package J4;

import java.util.ArrayList;
import java.util.Scanner;

public class J42015 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner (System.in);

        ArrayList<String> arr = new ArrayList<String>();
        int nLines = scanner.nextInt();
        int cLine = 0;
        while (cLine < nLines) {
            String in = scanner.nextLine();
            String n = in.substring(2);
            String letter = in.substring(0, 0);
            arr.add(letter);
            arr.add(n);
        }
        System.out.println(arr);
    }
}
