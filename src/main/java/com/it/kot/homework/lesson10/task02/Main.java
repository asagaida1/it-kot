package com.it.kot.homework.lesson10.task02;

/*
 Создать и заполнить массив из 10 чисел, значениями от 10 до 1
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }

        for (int value : arr) {
            System.out.println(value);
        }
    }
}
