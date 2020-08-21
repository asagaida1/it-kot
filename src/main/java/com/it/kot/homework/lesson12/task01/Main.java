package com.it.kot.homework.lesson12.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 Написать программу, которая позволяет ввести с клавиатуры 5 чисел и выводит их в убывающем порядке.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        int [] arr = new int [5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[arr.length-i-1]);
        }
    }
}
