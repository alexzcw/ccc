package J4;

import java.util.ArrayList;
import java.util.Scanner;

public class J42008 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String expression = scanner.nextLine();
            if(expression.equals("0"))
                break;

            System.out.println(toInfixNotation(expression.replaceAll(" ", "")));
        }
    }

    public static String toInfixNotation(String in){
        ArrayList<String> result = new ArrayList<String>();

        for(char c : in.toCharArray())
            result.add(String.valueOf(c));

        int size = result.size();

        for(int i = size - 1; i >= 0; i--){
            String cItem = result.get(i);
            if(cItem.equals("+") || cItem.equals("-")){
                result.set(i, result.get(i + 1) +" "+ result.get(i + 2) +" "+ cItem);
                result.remove(i + 1);
                result.remove(i + 2 - 1);
            }
        }

        String out = "";
        for (int i = 0; i < result.size(); i++)
            out += result.get(i);

        return out;
    }
}
