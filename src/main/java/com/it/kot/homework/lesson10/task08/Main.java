package com.it.kot.homework.lesson10.task08;

/*
 Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
 Найти минимальный элемент в массиве и вывести его в консоль.
*/
public class Main {
    public static void main(String[] args) {
        int minValueArr;
        int [] arr = new int []{-9,-10,0,4,3};
        minValueArr = arr[0];
        for (int value:arr) {
            if(minValueArr>value){
                minValueArr=value;
            }
        }
        System.out.println(minValueArr);
    }
}
