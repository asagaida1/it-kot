package com.it.kot.homework.lesson09.task03;

public class Man {
    private String name;
    private int age;
    private Woman wife;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Man setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Man setAge(int age) {
        this.age = age;
        return this;
    }

    public Woman getWife() {
        return wife;
    }

    public Man setWife(Woman wife) {
        this.wife = wife;
        return this;
    }
}
