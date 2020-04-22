package J3;

import java.util.Scanner;

public class J32018 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner (System.in);
        String s = " ";
        int one2 = scanner.nextInt();
        int two3 = scanner.nextInt();
        int three4 = scanner.nextInt();
        int four5 = scanner.nextInt();
        System.out.println("0 "+one2+s+(one2+two3)+s+(one2+two3+three4)+s+(one2+two3+three4+four5));
        System.out.println(one2+" 0 "+(two3)+s+(two3+three4)+s+(two3+three4+four5));
        System.out.println((one2+two3)+s+two3+" 0 "+three4+(three4+four5));
        System.out.println((two3+three4+four5)+s+(two3+three4)+s+two3+" 0 "+one2);
        System.out.println((one2+two3+three4+four5)+s+(one2+two3+three4)+s+(one2+two3)+s+(one2)+" 0");
    }
}
