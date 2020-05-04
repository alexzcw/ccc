package J4;

import java.util.Scanner;

public class J42010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        while (n != 0) {
            n = in.nextInt();
            String warmings = in.nextLine();
            warmings = warmings.substring(1);

            int[] changes = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                changes[i] = Integer.parseInt(warmings.split(" ")[i + 1]) - Integer.parseInt(warmings.split(" ")[i]);
            }

            int j = 1;
            cycle: for (; j < n; j++) {
                for (int k = 0; k < n - 1; k++) {
                    if (changes[k] != changes[k % j]) {
                        continue cycle;
                    }
                }
                break;
            }
            System.out.println(n == 1 ? 0 : j);
        }
    }
}
