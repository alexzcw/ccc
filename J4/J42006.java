package J4;
import java.util.ArrayList;
import java.util.Scanner;

public class J42006 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int a = 1; a <= 7; a++)
            arr.add(a);

        int before = scanner.nextInt();
        int after = scanner.nextInt();

        while(before != 0 && after != 0) {
            int bindex = arr.indexOf(before);
            int aindex = arr.indexOf(after);
            if (bindex > aindex) {
                if(after == 1) {
                    arr.add(arr.indexOf(1), before);
                    arr.remove(before);
                } else {
                    for (int m = bindex; m > 0; m--) {
                        if(m <= aindex) {
                            arr.remove(bindex);
                            arr.add(m, before);
                            break;
                        }
                    }
                }
            }
            before = scanner.nextInt();
            after = scanner.nextInt();
        }
        String result = arr.toString();
        result = result.replaceAll(",", "");
        System.out.println(result.substring(1, result.length() - 1));
    }

}