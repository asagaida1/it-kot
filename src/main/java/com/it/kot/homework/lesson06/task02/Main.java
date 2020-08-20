package com.it.kot.homework.lesson06.task02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» будет получать «число1» через «число2» лет.
Пример:
Alex будет получать 4000 через 5 лет.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println(name+" будет получать "+ number1+" через "+number2+" лет.");
    }
}
