package com.it.kot.homework.lesson10.task03;

/*
 Создать и заполнить массив из 10 чисел, значениями от 10 до 19
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 10;
        }
        for (int value: arr) {
            System.out.println(value);
        }
    }
}
