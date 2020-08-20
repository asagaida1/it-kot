package com.it.kot.homework.lesson07.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Реализовать метод checkInterval.
 Метод должен проверять попало ли целое число в интервал от 20 до 50 и сообщить
 результат на экран в следующем виде: "Число а не содержится в интервале." или
 "Число а содержится в интервале.", где а - аргумент метода.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        checkInterval(number);

    }
    public static void checkInterval(int number){
        if(number>=20 && number<=50){
            System.out.println("Число "+number+" содержится в интервале");
        }
        else {
            System.out.println("Число "+number+" не содержится в интервале");
        }
    }
}
