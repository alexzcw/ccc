package J3;

import java.util.ArrayList;
import java.util.Scanner;

public class J32007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0, 100);
        arr.add(1, 500);
        arr.add(2, 1000);
        arr.add(3, 5000);
        arr.add(4, 10000);
        arr.add(5, 25000);
        arr.add(6, 50000);
        arr.add(7, 100000);
        arr.add(8, 500000);
        arr.add(9, 1000000);
        int nBoxes = scanner.nextInt();
        for (int c = 0; c < nBoxes; c++) {
            int remove = scanner.nextInt();
            arr.remove(remove - 1);
        }
        int offer = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
        }
        int average = total / arr.size();
        if (average > offer)
            System.out.println("Deal");
        else
            System.out.println("No Deal");
    }
}
