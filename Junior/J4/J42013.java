package J4;

import java.util.Arrays;
import java.util.Scanner;

public class J42013 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int C = in.nextInt();

        int[] chores = new int[C];
        for (int i = 0; i < C; i++) {
            chores[i] = in.nextInt();
        }

        int finishedChores = 0;
        Arrays.sort(chores);
        for (int i = 0; i < chores.length; i++) {
            int minutes = chores[i];

            if (minutes <= T) {
                finishedChores++;
                T -= minutes;
            } else {
                i = chores.length;
            }
        }
        System.out.println(finishedChores);

    }
}
