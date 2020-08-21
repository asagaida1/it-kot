package com.it.kot.homework.lesson09.task02;

public class Fish {
    private String name;
    private int age;
    private Woman owner;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Fish setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Fish setAge(int age) {
        this.age = age;
        return this;
    }

    public Woman getOwner() {
        return owner;
    }

    public Fish setOwner(Woman owner) {
        this.owner = owner;
        return this;
    }
}
