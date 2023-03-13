package org.example;

public class Main {
    public static void main(String[] args) {
        // создаем участников
        People human1 = new People("Иван", 300, 1.2);
        People human2 = new People("Петя", 200, 1.05);
        Cat cat1 = new Cat("Басик", 145, 1.1);
        Cat cat2 = new Cat("Гефест", 190, 0.8);
        Robot robot1 = new Robot("T-800", human1.maxRunDistance * 3, human2.maxJumpHeigth * 2);
        // формируем команду участников
        Someone[] runners = {human1, human2, cat1, cat2, robot1};
        // обозначаем трассу
        Treadmill treadmill = new Treadmill(60,220);
        Barrier barrier = new Barrier(0.4,1.4);
        Course course = new Course(10);
        double[] race = course.createCourse(treadmill,barrier);
        // устраиваем забег
        for (Someone runner : runners) {
            for (int i = 0; i < race.length; i++) {
                if (i % 2 == 0) {
                    if (runner.runRace((int) race[i])) {
                        runner.run((int) race[i]);
                        System.out.println();
                    }else{
                        System.out.println(runner.name + "сошёл");
                        break;
                    }
                    ;
                } else {
                    if (runner.jumpRace(race[i])) {
                        runner.jump(race[i]);
                        System.out.println();
                    }
                    else{
                        System.out.println(runner.name + " сошёл");
                        break;
                    }
                }
            }
        }
    }
}