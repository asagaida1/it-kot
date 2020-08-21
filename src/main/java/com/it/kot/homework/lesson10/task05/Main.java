package com.it.kot.homework.lesson10.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Ввести 5 строк с клавиатуры и записать их в массив
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readLine();
        }

        for (String value: arr) {
            System.out.println(value);
        }
    }
}
