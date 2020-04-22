package J2;

import java.util.Scanner;

public class J22016 {
    public J22016() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int h = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int o = scanner.nextInt();
        int p = scanner.nextInt();
        int[][] var10000 = new int[][]{{a, b, c, d}, {e, f, g, h}, {i, j, k, l}, {m, n, o, p}};
        int c1 = a + e + i + m;
        int c2 = b + f + j + n;
        int c3 = c + g + k + o;
        int c4 = d + h + l + p;
        int r1 = a + b + c + d;
        int r2 = e + f + g + h;
        int r3 = i + j + k + l;
        int r4 = m + n + o + p;
        if (c1 == c2 && c2 == c3 && c3 == c4 && r1 == r2 && r2 == r3 && r3 == r4 && c1 == r1) {
            System.out.println("Magic");
        } else {
            System.out.println("Not Magic");
        }

    }
}
