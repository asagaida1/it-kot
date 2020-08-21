package com.it.kot.homework.lesson11.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на 5 строк.
2. Создать массив на 5 чисел.
3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
 индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        String [] arrStr = new String[5];
        int [] arrInt = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = reader.readLine();
        }
        for (int i = 0; i <arrStr.length ; i++) {
            arrInt[i]=arrStr[i].length();
        }

        for (int value:arrInt) {
            System.out.println(value);
        }
    }
}
