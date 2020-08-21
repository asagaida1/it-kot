package com.it.kot.homework.lesson09.task02;

public class Cat {
    private String name;
    private int age;
    private Woman owner;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Woman getOwner() {
        return owner;
    }

    public Cat setOwner(Woman owner) {
        this.owner = owner;
        return this;
    }
}
