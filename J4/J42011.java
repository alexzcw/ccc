package J4;

import java.util.Scanner;

public class J42011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //rows | columns
        int [][] grid = new int [199][399];
        fill(grid);

        String out = "";
        String next = scanner.nextLine();
        int cr = 4;
        int cc = 18;

        boolean quit = false;
        while (next.charAt(0) != 'q') {
            char a = next.charAt(0);
            int s = Integer.valueOf(next.substring(2));

            if (a == 'd') {
                int i;
                for (i = cr; i < s + cr; i++) {
                    if (grid[i+1][cc] == 1) {
                        out += (cc-19) + " " + (cr + s + 1)*-1 + " " + "DANGER";
                        out += "\n";
                        quit = true;
                        break;
                    }
                    else
                        grid[i+1][cc] = 1;
                }
                if (quit)
                    break;
                out +=  (cc-19) + " " + "-" + (i+1) + " " + "safe";
                out += "\n";
                cr += s;
            }
            if (quit)
                break;
            if (a == 'u') {
                int i;
                for (i = cr; i > cr - s; i--) {
                    if (grid[i-1][cc] == 1) {
                        out += (cc-19) + " " + (i*-1) + " " + "DANGER";
                        out += "\n";
                        quit = true;
                        break;
                    }
                    else
                        grid[i-1][cc] = 1;
                }
                if (quit)
                    break;
                out += (cc - 19) + " " + "-" + (i+1) + " " + "safe";
                out += "\n";
                cr -= s;
            }
            if (quit)
                break;
            if (a == 'r') {
                int i;
                for (i = cc; i < s + cc; i++) {
                    if (grid[cr][i+1] == 1) {
                        out += i + " -"+ (cr-19) + " DANGER";
                        out += "\n";
                        quit = true;
                        break;
                    } else
                        grid[cr][i+1] = 1;
                }
                if (quit)
                    break;
                if ((19 - (cc + s)) < 0)
                    out += (19 - (cc + s)) + " "+ "-"+ (cr+1) + " safe";
                else
                    out += "-"+(19 - (cc + s)) + " -"+ (cr+1) + " safe";
                out += "\n";
                cc += s;
            }
            if (quit)
                break;
            if (a == 'l') {
                int i;
                for (i = cc; i > cc - s; i--) {
                    if (grid[cr][i-1] == 1) {
                        out +=  i +" -"+ (cr-19) + " DANGER";
                        out += "\n";
                        quit = true;
                        break;
                    } else
                        grid[cr][i-1] = 1;
                }
                if (quit)
                    break;
                if ((19 - (cc - s)) < 0)
                    out += "-"+(19 - (cc - s)) + " "+ (cr+1) + " safe";
                else
                    out += "-"+(19 - (cc - s)) + " -"+ (cr+1) + " safe";
                out += "\n";
                cc -= s;
            }

            if (quit)
                break;
            next = scanner.nextLine();
        }
        System.out.println(out);
//		print(grid);
    }
    public static void print(int [][] arr) {
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
    public static void fill(int [][] grid) {
        grid[0][199] = 1;
        grid[1][199] = 1;
        grid[2][199] = 1;
        grid[2][200] = 1;
        grid[2][201] = 1;
        grid[2][202] = 1;
        grid[3][202] = 1;
        grid[4][202] = 1;
        grid[4][203] = 1;
        grid[4][204] = 1;
        grid[3][204] = 1;
        grid[2][204] = 1;
        grid[2][205] = 1;
        grid[2][206] = 1;
        grid[3][206] = 1;
        grid[4][206] = 1;
        grid[5][206] = 1;
        grid[6][206] = 1;

        grid[6][205] = 1;
        grid[6][204] = 1;
        grid[6][203] = 1;
        grid[6][202] = 1;
        grid[6][201] = 1;
        grid[6][200] = 1;
        grid[6][199] = 1;
        grid[6][198] = 1;

        grid[5][198] = 1;
        grid[4][198] = 1;
    }
}
