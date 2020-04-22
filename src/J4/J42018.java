package J4;

import java.util.Scanner;

public class J42018 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int[][] result = (rotate(arr, N));
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotate(int[][] new_table, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size / 2; j++) {
                int temp = new_table[i][size - j - 1];
                new_table[i][size - j - 1] = new_table[i][j];
                new_table[i][j] = temp;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp = new_table[i][j];
                new_table[i][j] = new_table[j][i];
                new_table[j][i] = temp;
            }
        }
        return new_table;
    }
}
