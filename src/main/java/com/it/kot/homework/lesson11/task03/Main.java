package com.it.kot.homework.lesson11.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        int [] arr = new int [10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int [] arr2 = new int [5];
        int [] arr3 = new int [5];

        for (int i = 0; i <arr2.length ; i++) {
            arr2[i]=arr[i];
        }

        for (int i = 0; i <arr3.length ; i++) {
            arr3[i]=arr[i+arr2.length];
        }

        for (int value: arr3) {
            System.out.println(value);
        }
    }
}
