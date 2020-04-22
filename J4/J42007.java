package J4;

import java.util.Scanner;

public class J42007 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first phrase> ");
        String first = scanner.nextLine().replaceAll(" ", "");
        System.out.print("Enter second phrase> ");
        String second = scanner.nextLine().replaceAll(" ", "");

        String mainPhrase = (first.length() >= second.length()) ? first : second;
        String bufferPhrase = (first.length() < second.length()) ? first : second;

        char[] letterCheck = bufferPhrase.toCharArray();

        for(char a : letterCheck)
            mainPhrase = mainPhrase.replace(String.valueOf(a), "");

        if(mainPhrase.equals("") || mainPhrase.equals(null))
            System.out.println("Is an anagram.");
        else
            System.out.println("Is not an anagram.");
    }
}
