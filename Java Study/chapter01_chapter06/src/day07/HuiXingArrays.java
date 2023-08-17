package day07;

import java.util.Scanner;

public class HuiXingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int num = 1;
        int row = 0, col = n - 1;
        while (num <= n * n) {
            for (int i = row, j = col; i < n && j < n; i++, j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = num++;
                }
            }
            if (col > 0) {
                col--;
            } else {
                row++;
            }
            for (int i = row, j = col; i < n && j >= 0; i++, j--) {
                if (arr[i][j] == 0) {
                    arr[i][j] = num++;
                }
            }
            if (row < n - 1) {
                row++;
            } else {
                col--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
