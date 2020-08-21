package com.it.kot.homework.lesson09.task01;

public class Robot {
    private String name;
    private int age;
    private double power;

    public Robot(String name, int age, double power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPower() {
        return power;
    }

    public boolean fight(Robot robot2) {
        return this.getPower() > robot2.getPower();
    }
}
