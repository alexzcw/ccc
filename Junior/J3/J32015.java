package J3;

import java.util.Scanner;

public class J32015 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String cVowel= "aaaeeeeiiiiioooooouuuuuuuu";
        String cConsa= "bcdffghjjklmnppqrstvvwxyzz";
        String result = "";
        String str = scanner.nextLine();

        int x = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (alpha.charAt(j) == str.charAt(i))
                    x = j;
            }
            if (!isVowel(str.charAt(i))) {
                result += str.charAt(i);
                result += cVowel.charAt(x);
                result += cConsa.charAt(x);
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
    public static boolean isVowel (char x) {
        if (x == 'a' || x == 'e'||x =='i'||x =='o'||x =='u')
            return true;
        else
            return false;
    }
}
