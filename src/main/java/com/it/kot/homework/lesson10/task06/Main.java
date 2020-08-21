package com.it.kot.homework.lesson10.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Ввести 5 чисел с клавиатуры и записать их в массив
 Вывести содержимое массива в консоль
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (int value: arr) {
            System.out.println(value);
        }
    }
}
