package com.it.kot.homework.lesson08.task02;

/*
Вывести на экран числа от 10 до 1 используя цикл while.
*/
public class Main {
    public static void main(String[] args) {
        int i = 10;
        while(true){
            System.out.println(i);
            i--;
            if(i<1){
                break;
            }
        }

    }
}
