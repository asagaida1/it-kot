package com.it.kot.homework.lesson09.task03;

/*
1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы объекты стали мужем и женой.
*/
public class Main {
    public static void main(String[] args) {
        Woman lena = new Woman("Lena", 18);
        Man igor = new Man("Igor", 19);
        lena.setHusband(igor);
        igor.setWife(lena);

    }
}
