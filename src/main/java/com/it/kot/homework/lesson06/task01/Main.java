package com.it.kot.homework.lesson06.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры число n.
Вывести на экран надпись «Я зарабатываю $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        System.out.println("Я зарабатываю $" + s + " в час");
    }
}
