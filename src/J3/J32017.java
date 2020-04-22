package J3;

import java.util.Scanner;

public class J32017 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int t = scanner.nextInt();
        int i = Math.abs(a - c) + Math.abs(b - d);
        if (Math.abs(t - i)%2 == 0)
            System.out.println("Y");
        else
            System.out.println("N");
    }
}
