package com.it.kot.homework.lesson07.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Ввести с клавиатуры два числа, вывести на экран максимальное из них.
*/
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        if(num1>num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

    }
}
