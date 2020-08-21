package com.it.kot.homework.lesson11.task01;

public class Human {
    private String name;
    private boolean genderMan;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, boolean genderMan, int age) {
        this.name = name;
        this.genderMan = genderMan;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Human setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isGenderMan() {
        return genderMan;
    }

    public Human setGenderMan(boolean genderMan) {
        this.genderMan = genderMan;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Human getFather() {
        return father;
    }

    public Human setFather(Human father) {
        this.father = father;
        return this;
    }

    public Human getMother() {
        return mother;
    }

    public Human setMother(Human mother) {
        this.mother = mother;
        return this;
    }

    @Override
    public String toString() {
        return "Имя: " + name + '\'' +
                ", пол: " + genderMan +
                ", возраст: " + age +
                ", отец: " + father +
                ", мать: " + mother;
    }
}
