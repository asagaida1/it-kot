package com.it.kot.homework.lesson10.task07;

/*
 Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
 Посчитать сумму элементов массива и вывести её на экран.
*/
public class Main {
    public static void main(String[] args) {
        int sumValueArr = 0;
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int value:arr) {
            sumValueArr+=value;
        }
        System.out.println(sumValueArr);
    }
}
