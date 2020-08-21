package com.it.kot.homework.lesson09.task02;

public class Dog {
    private String name;
    private int age;
    private Woman owner;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Woman getOwner() {
        return owner;
    }

    public Dog setOwner(Woman owner) {
        this.owner = owner;
        return this;
    }
}
