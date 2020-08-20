package com.it.kot.homework.lesson04.task01;

/*

1) Создать метод sum, который должен суммировать 2 числа.

1) Создать метод multy, который должен умножить 2 числа.

1) Создать метод subt, который должен вычесть второе число из первого.

1) Создать метод div, который должен делить 2 числа.

*/
public class Main {
    public static void main(String[] args) {
        double s = sum(13.5, 1.5);
        System.out.println(s);

        double m = multy(3, 2);
        System.out.println(m);

        double subtV = subt(3, 2);
        System.out.println(subtV);

        double d = div(10, 2);
        System.out.println(d);
    }

    public static double sum(double number1, double number2) {
        double result;
        result = number1 + number2;
        return result;
    }

    public static double multy(double number1, double number2) {
        double result;
        result = number1 * number2;
        return result;
    }

    public static double subt(double number1, double number2) {
        double result;
        result = number1 - number2;
        return result;
    }

    public static double div(double number1, double number2) {
        double result;
        result = number1 / number2;
        return result;
    }

}
