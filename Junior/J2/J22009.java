package J2;

import java.util.Scanner;

public class J22009 {
    public static int bt;
    public static int np;
    public static int yp;
    public static int limit;
    public static int answer;

    public J22009() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the Brown Trout's points: ");
        bt = s.nextInt();
        System.out.println("Please enter the Northern pike's points: ");
        np = s.nextInt();
        System.out.println("Please enter the Yellow Pickerel's points: ");
        yp = s.nextInt();
        System.out.println("Please enter the total number of points allowed: ");
        limit = s.nextInt();

        for(int pickerel = 0; pickerel <= limit / yp; ++pickerel) {
            for(int pike = 0; pike <= limit / np; ++pike) {
                for(int trout = 0; trout <= limit / bt; ++trout) {
                    if ((trout != 0 || pike != 0 || pickerel != 0) && bt * trout + yp * pickerel + np * pike <= limit) {
                        ++answer;
                        System.out.println(trout + " Brown Trout | " + pike + " Northern Pike | " + pickerel + " Yellow Pickerel");
                    }
                }
            }
        }

        System.out.println("Total number of ways to catch fish: " + answer);
    }
}
