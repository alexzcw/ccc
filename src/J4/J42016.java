package J4;

import java.util.Scanner;

public class J42016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String departure = in.nextLine();

        int numTime = Integer.parseInt(departure.replaceAll(":", "")) + 1;
        int i = 0;
        while (i < 119) {
            if (numTime > 2359) {
                numTime = 100;
            } else if (numTime % 100 > 59) {
                numTime = numTime / 100 * 100 + 100;
            }

            if ((numTime >= 700 && numTime <= 1000) || (numTime >= 1500 && numTime <= 1900)) {
                numTime += 2;
            } else {
                numTime++;
            }
            i++;
        }
        String str = Integer.toString(numTime);
        if (str.length() == 3)
            System.out.println(str.substring(0, 1)+":"+str.substring(2));
        else
            System.out.println(str.substring(0, 2)+":"+str.substring(2));
    }
}
