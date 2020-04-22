package J4;

import java.util.Scanner;

public class J42005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt()-1;
        int h = scanner.nextInt()-1;
        int sw = scanner.nextInt();
        int sh = scanner.nextInt();
        int steps = scanner.nextInt()+1;

        int [][] board = new int [h+1][w+1];

        for (int i = 0; i < sh; i++) {
            for (int j = 0; j < sw; j++) {
                board[i][j] = 1;
            }
        }

        for (int i = h; i > h - sh; i--) {
            for (int j = w; j > w - sw; j--) {
                board[i][j] = 1;
            }
        }

        for (int i = h; i > h - sh; i--) {
            for (int j = 0; j < sw; j++) {
                board[i][j] = 1;
            }
        }

        for (int i = 0; i < sh; i++) {
            for (int j = w; j > w - sw; j--) {
                board[i][j] = 1;
            }
        }

        int cx = sw;
        int cy = 0;
        int count = 0;
        boolean done = false;
        while (!done) {
            //1
            while(board[cy][cx + 1] != 1) {
                board[cy][cx] = 1;
                if (count == steps) {
                    done = true;
                    break;
                }
                cx++;
                count++;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
            while(board[cy][cx+1] != 0) {
                board[cy][cx] = 1;
                cy++;
                count++;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
            while(cx != w) {
                board[cy][cx] = 1;
                cx++;
                count++;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
            //2
            while(board[cy+1][cx] != 1 && cy < h-1) {
                board[cy][cx] = 1;
                cy++;
                count++;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
            while(board[cy+1][cx] != 0) {
                board[cy][cx] = 1;
                cx--;
                count++;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
            while(cy != h) {
                board[cy][cx] = 1;
                cy++;
                count++;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
            //3
            while(board[cy][cx-1] != 1) {
                board[cy][cx] = 1;
                cx--;
                count++;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
            while(board[cy][cx-1] != 0 && cx > 1) {
                board[cy][cx] = 1;
                cy--;
                count++;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
            while(cx != 0) {
                board[cy][cx] = 1;
                cx--;
                count++;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
            //4
            while(board[cy-1][cx] != 1) {
                board[cy][cx] = 1;
                cy--;
                count++;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
            while(board[cy-1][cx] != 0) {
                board[cy][cx] = 1;
                cx++;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
            while(cy != 0) {
                board[cy][cx] = 1;
                cy--;
                if (count == steps) {
                    done = true;
                    break;
                }
            }
            if (done) break;
        }
        print(board);
        System.out.println((cx+1) +" "+ cy);
    }
    public static void print(int [][] arr) {
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}