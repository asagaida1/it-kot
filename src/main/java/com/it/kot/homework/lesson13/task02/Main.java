package com.it.kot.homework.lesson13.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Создать массив на 5 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        int [] arr = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min;
        int max;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        min=arr[0];
        max=arr[0];

        for (int value:arr) {

            if(value>max){
                max = value;
            }
            if(value<min){
                min=value;
            }
        }
        System.out.print(max + " " + min);

    }
}
