package com.it.kot.homework.lesson08.task06;

/*
Вывести на экран квадрат 10х10 из букв P используя цикл while.
*/
public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10 && i > 0) {
            i++;
            int j = 2;
            while (j <= 10 && j > 0) {
                System.out.print("P");
                j++;
            }
            System.out.println("P");

        }


    }
}
