package com.it.kot.homework.lesson07.task07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Реализовать метод closeToFive.
 Метод должен выводить на экран ближайшее к 5 из двух чисел, записанных в
 аргументах метода. Например, среди чисел 3 и 6 ближайшее к пяти 6.
 Если оба числа на равной длине к 5, то вывести на экран любое из них.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        closeToFive(num1, num2);

    }
    public static void closeToFive(int num1, int num2){
        int tmp1 = Math.abs(num1-5);
        int tmp2 = Math.abs(num2-5);
        if(tmp1>tmp2){
            System.out.println(num2);
        } else{
            System.out.println(num1);
        }
    }
}
