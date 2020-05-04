package J3;

import java.util.Scanner;

public class J32006 {
    public static void main (String[]args) {
        Scanner scanner  = new Scanner (System.in);

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String nPress ="12312312312312312341231234";
        String in = scanner.nextLine()+" ";

        String result = "";
        while (!in.equals("halt ")) {
            int count = 0;
            for (int j = 0; j < in.length(); j++) {
                for(int i = 0; i < 25; i++) {
                    if(alpha.charAt(i) == in.charAt(j)) {
                        count += Character.getNumericValue(nPress.charAt(i));
                        if(in.charAt(j) == in.charAt(j + 1)) {
                            count += 2;
                            break;
                        }
                        break;
                    }
                }
            }
            result += count + "\n";
            in = scanner.nextLine()+" ";
        }
        System.out.println(result);
    }
}