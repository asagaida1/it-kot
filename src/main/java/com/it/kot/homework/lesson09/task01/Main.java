package com.it.kot.homework.lesson09.task01;

/*
Создать класс Robot с параметрами: name, age, power
Реализовать метод boolean fight(Robot anotherRobot):
реализовать механизм драки роботов в зависимости от силы.
Метод должен определять, выиграл ли робот у которого вызвали метод fight (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если robot1.fight(robot2) = true , то robot2.fight(robot1) = false
*/
public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Egor", 17, 15.2);
        Robot robot2 = new Robot("Alex", 18, 16.2);
        System.out.println(robot1.fight(robot2));
        System.out.println(robot2.fight(robot1));

    }
}
