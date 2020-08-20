package com.it.kot.homework.lesson04.task02;
/*

1) Создать метод convert, который должен конвертировать евро в доллары. В метод должен приходить один аргумент (к-во евро). Метод должен возвращать к-во долларов.

2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.

3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.

*/
public class Main {
    public static void main(String[] args) {
        double c = convert(100);
        System.out.println(c);

        double p = percent(200);
        System.out.println(p);

        print("String");

    }
    public static double convert (double euro){
        double exchangeCourse = 1.50;
        double countUsd = euro*exchangeCourse;
        return countUsd;
    }

    public static double percent (double number){
        double percent = 1.10;
        double countUsd = number*percent;
        return countUsd;
    }

    public static void print(String s){
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }

}
