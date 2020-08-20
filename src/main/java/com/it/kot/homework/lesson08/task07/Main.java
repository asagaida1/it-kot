package com.it.kot.homework.lesson08.task07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        while(true){
            int number = Integer.parseInt(reader.readLine());
            if(number==-1){
                result = result+number;
                break;
            } else {
                result=result+number;
            }
        }
        System.out.println(result);
    }
}
