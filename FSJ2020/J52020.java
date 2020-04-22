package FSJ2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J52020 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] room = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                room[i][j] = scanner.nextInt();
//        print(room);
        room[m][n] = -1;
        scanner.close();

        int goal = m*n;
        boolean done = false;
        boolean possible = false;
        int px;
        int py;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (room[i][j] == goal) {
                    possible = true;
                    break;
                }

        boolean found = false;
        if (possible) {
            while (!done || found) {
                found = false;
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (room[i][j] == goal) {
                            if (i == 0 && j == 0) {
                                done = true;
                                break;
                            }
                            room[i][j] = -1;
                            py = i + 1;
                            px = j + 1;
                            goal = px * py;
                            print(room);
                            found = true;
                            System.out.println("Found at: " + px + ", " + py + " | Looking for: " + goal);
                            break;
                        }
                    }
                    if (done) break;
                }
            }
        }

        if(done) System.out.println("yes");
        else System.out.println("no");
    }

    public static void print (int [] [] array) {
        for (int[] x : array) {
            for (int y : x)
                System.out.print(y + " ");
            System.out.println();
        }
    }
}
