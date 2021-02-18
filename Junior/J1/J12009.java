import java.util.Scanner;

public class J12009 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("11th digit? ");
        int a = scanner.nextInt();
        System.out.print("12th digit? ");
        int b = scanner.nextInt();
        System.out.print("13th digit? ");
        int c = scanner.nextInt();

        System.out.println("The 1-3 sum is: "+(91 + a + b*3 +c));
    }
}
