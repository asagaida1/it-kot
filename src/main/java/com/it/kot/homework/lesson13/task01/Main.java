package com.it.kot.homework.lesson13.task01;

/*
 Задача по алгоритмам.
 Есть массив чисел, в котором все числа дублируются, кроме одного. Найдите число, которое не имеет дубликатов в массиве.
 Пример ввода:
 {1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6}
 Пример вывода:
 1
*/
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6};
        int count;
        int current;
        for (int value : arr) {
            count = 0;
            current = value;
            for (int i : arr) {
                if (current == i) {
                    count++;
                }
            }
            if (count < 2) {
                System.out.println(current);
                break;
            }
        }
    }
}
