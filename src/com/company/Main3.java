package com.company;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        int N = 10;
        int mas[] = new int[N];
        int index = 0;
        int number = 0;
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            mas[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            number = i + 1;

            do {
                index = random.nextInt(N);
            } while (mas[index] != 0);

            mas[index] = number;
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%-5d", mas[i]);
        }

    }
}