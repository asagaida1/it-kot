package com.it.kot.homework.lesson11.task01;

/*
Создай класс Human с полями
имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, двое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
public class Main {
    public static void main(String[] args) {

        Human doughter = new Human("Katya", false, 5);
        Human father = new Human("Ivan", true, 20);
        Human mother = new Human("Ira", false, 21);
        Human grandmother = new Human("Praskoviya", false, 50);
        Human grandfather = new Human("Nikolay", true, 51);
        Human grandmother2 = new Human("Elizaveta", false, 50);
        Human grandfather2 = new Human("Lev", true, 51);

        doughter.setFather(father);
        doughter.setMother(mother);

        father.setMother(grandmother);
        father.setFather(grandfather);

        mother.setMother(grandmother2);
        mother.setFather(grandfather2);

//        System.out.println(doughter);
        System.out.println(grandfather);


    }
}
