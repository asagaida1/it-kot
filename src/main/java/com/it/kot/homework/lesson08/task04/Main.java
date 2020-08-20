package com.it.kot.homework.lesson08.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
pro
2
Пример вывода:
pro
pro
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int count = Integer.parseInt(reader.readLine());

        while (true){
            System.out.println(s);
            count--;
            if(count<1){
                break;
            }
        }

    }
}
