package com.company;

public class Main {

    public static void main(String[] args) {
        int N = 5;
        int mas[][] = new int[N][N];
        int num = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                mas[i][j] = (i + j + num);
                if (mas[i][j] > N) {
                    mas[i][j] = (i + j + num - N);
                }
            }
        }

        System.out.println();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%-2d", mas[i][j]);
            }
            System.out.println();
        }

    }
}