package J4;

import java.util.Scanner;

public class J42009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter w: ");
        int w = scanner.nextInt();

        boolean done = false;
        String fresult = "";
        int cword = 0;
        while(!done) {
            String result = "";
            String spaces = "";
            int cindex = 0;
            int nSpaces = 0;
            int nWords = 0;
            boolean fwol = true;
            while(true) {

                if (cword == 0) {
                    nWords++;
                    cindex += 7;
                    cword = 1;
                    if(fwol) {
                        result += "WELCOME";
                        fwol = false;
                    } else {
                        result += " WELCOME";
                    }
                }
                if (cword == 1) {
                    if(cindex + 3>= w)
                        break;
                    nWords++;
                    cindex += 3;
                    cword = 2;
                    if(fwol) {
                        result += "TO";
                        fwol = false;
                    } else {
                        result += " TO";
                    }
                }
                if (cword == 2) {
                    if(cindex + 4 >= w)
                        break;
                    nWords++;
                    cindex += 4;
                    cword = 3;
                    if(fwol) {
                        result += "CCC";
                        fwol = false;
                    } else {
                        result += " CCC";
                    }
                }
                if (cword == 3) {
                    if(cindex + 5 >= w)
                        break;
                    nWords++;
                    cindex += 5;
                    cword = 4;
                    if(fwol) {
                        result += "GOOD";
                        fwol = false;
                    } else {
                        result += " GOOD";
                    }
                }

                if (cword == 4) {
                    if(cindex + 5 >= w)
                        break;
                    nWords++;
                    cindex += 5;
                    cword = 5;
                    if(fwol) {
                        result += "LUCK";
                        fwol = false;
                    } else {
                        result += " LUCK";
                    }
                }

                if (cword == 5) {
                    if(cindex + 4 >= w)
                        break;
                    nWords++;
                    if(!fwol) {
                        result += " TODAY";
                    } else {
                        result += "TODAY";
                        fwol = false;
                    }
                    done = true;
                }
                break;
            }
            nSpaces = w - result.length();
            for(int s = 0; s < nSpaces; s++) {
                spaces += " ";
            }
            if(nWords == 1) {
                for(int s = 0; s < nSpaces; s++) {
                    result += " ";
                }
            }
            else {
                int fp = 0;
                for(int p = 0; p < result.length(); p++) {
                    if(result.charAt(p) == ' ') {
                        break;
                    }
                    fp = p;
                }
                result = result.substring(0, fp + 1) + spaces + result.substring(fp + 1);
            }
            fresult += result +"\n";
        }
        System.out.println(fresult.replaceAll(" ", "."));
    }
}