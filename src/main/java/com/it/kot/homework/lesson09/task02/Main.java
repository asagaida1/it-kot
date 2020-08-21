package com.it.kot.homework.lesson09.task02;

/*
1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы владельцем каждого питомца была одна и та же женщина.
*/
public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman("Sveta", 39);
        Cat cat = new Cat("Murzik", 3);
        cat.setOwner(woman);

        Dog dog = new Dog("Sharik", 2);
        dog.setOwner(woman);

        Fish fish = new Fish("Nemo", 1);
        fish.setOwner(woman);


    }
}
