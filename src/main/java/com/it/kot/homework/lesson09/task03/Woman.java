package com.it.kot.homework.lesson09.task03;

public class Woman {
    private String name;
    private int age;
    private Man husband;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Woman setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Woman setAge(int age) {
        this.age = age;
        return this;
    }

    public Man getHusband() {
        return husband;
    }

    public Woman setHusband(Man husband) {
        this.husband = husband;
        return this;
    }
}
