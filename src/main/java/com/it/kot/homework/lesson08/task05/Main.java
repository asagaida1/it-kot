package com.it.kot.homework.lesson08.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(8);
            }
            System.out.println(8);
        }
    }
}
