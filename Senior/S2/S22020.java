package FSJ2020;

import java.util.Scanner;

public class S22020 {
    public static int m;
    public static int n;
    public static int [][] room;
    public static boolean finished = false;
    public static int pastgoal;
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        room = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                room[i][j] = scanner.nextInt();
        room[m-1][n-1] = -1;
        scanner.close();

        int goal = m*n;
        solve(goal);
        if(finished)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    public static boolean solve (int goal) {
        boolean possible = false;
        int px;
        int py;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (room[i][j] == goal) {
                    possible = true;
                    if (i == 0 && j == 0) {
                        finished = true;
                        return true;
                    }
                }

        if (possible) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (room[i][j] == goal) {
                        room[i][j] = -1;
                        py = i + 1;
                        px = j + 1;
                        pastgoal = goal;
                        goal = px * py;
                        print(room);
                        System.out.println("Found at: " + px + ", " + py + " | Looking for: " + goal);
                        solve (goal);
                    }
                }
            }
        } else {
            finished = false;

        }return false;
    }
    public static void print (int [] [] array) {
        for (int[] x : array) {
            for (int y : x)
                System.out.print(y + " ");
            System.out.println();
        }
    }
}
