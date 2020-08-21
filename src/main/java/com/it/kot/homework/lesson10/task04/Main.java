package com.it.kot.homework.lesson10.task04;

/*
 Создать и заполнить массив из 10 чисел, значениями от 29 до 20
*/
public class Main {
    public static void main(String[] args) {
        int [] arr = new int [10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = 29-i;
        }
        for (int value:arr) {
            System.out.println(value);
        }
    }
}
