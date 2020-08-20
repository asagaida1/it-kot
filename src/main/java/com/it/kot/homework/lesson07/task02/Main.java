package com.it.kot.homework.lesson07.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Ввести с клавиатуры три числа, вывести на экран минимальное из них.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int tmp;

        if (num1 > num2) {
            tmp = num2;
        } else {
            tmp = num1;
        }

        if (num3 > tmp) {
            System.out.println(tmp);
        } else {
            System.out.println(num3);
        }
    }
}
