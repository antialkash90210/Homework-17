package com.company;

public class Main2 {

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int numbers = 1;
        int[][] mas = new int[m][n];


        for (int y = 0; y < n; y++) {
            mas[0][y] = numbers;
            numbers++;
        }
        for (int x = 1; x < m; x++) {
            mas[x][n - 1] = numbers;
            numbers++;
        }
        for (int y = n - 2; y >= 0; y--) {
            mas[m - 1][y] = numbers;
            numbers++;
        }
        for (int x = m - 2; x > 0; x--) {
            mas[x][0] = numbers;
            numbers++;
        }

        int c = 1;
        int d = 1;

        while (numbers < m * n) {

            while (mas[c][d + 1] == 0) {
                mas[c][d] = numbers;
                numbers++;
                d++;
            }

            while (mas[c + 1][d] == 0) {
                mas[c][d] = numbers;
                numbers++;
                c++;
            }

            while (mas[c][d - 1] == 0) {
                mas[c][d] = numbers;
                numbers++;
                d--;
            }

            while (mas[c - 1][d] == 0) {
                mas[c][d] = numbers;
                numbers++;
                c--;
            }
        }

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (mas[x][y] == 0) {
                    mas[x][y] = numbers;
                }
            }
        }

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (mas[x][y] < 10) {
                    System.out.printf("%-5d", mas[x][y]);
                } else {
                    System.out.printf("%-5d", mas[x][y]);
                }
            }
            System.out.println("");
        }
    }
}