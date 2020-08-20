package com.it.kot.homework.lesson07.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
 Если число отрицательное, то увеличить его на 10. Вывести результат на экран.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if (num >= 0) {
            System.out.println(num * 2);
        } else {
            System.out.println(num + 10);
        }
    }
}
