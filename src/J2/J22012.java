package J2;

import java.util.Scanner;

public class J22012 {
    public static int a;
    public static int b;
    public static int c;
    public static int d;

    public J22012() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the first reading: ");
        a = s.nextInt();
        System.out.println("Please enter the second reading: ");
        b = s.nextInt();
        System.out.println("Please enter the third reading: ");
        c = s.nextInt();
        System.out.println("Please enter the fourth reading: ");
        d = s.nextInt();
        if (a == b && b == c && c == d) {
            System.out.println("Fish At Constant Depth");
        } else if (a < b && b < c && c < d) {
            System.out.println("Fish Rising");
        } else if (a > b && b > c && c > d) {
            System.out.println("Fish Diving");
        } else {
            System.out.println("No Fish");
        }

    }
}
