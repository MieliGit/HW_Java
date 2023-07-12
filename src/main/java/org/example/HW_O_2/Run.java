package org.example.HW_O_2;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
            Random rand = new Random();
            Inter[] runners = new Inter[3];

            int distance = rand.nextInt(10);
            int heigth = rand.nextInt(10);
            runners[0] = new Human("Даниил", distance, heigth);

            distance = rand.nextInt(10);
            heigth = rand.nextInt(10);
            runners[1] = new Robot("Бип", distance, heigth);

            distance = rand.nextInt(10);
            heigth = rand.nextInt(10);
            runners[2] = new Cat("Буп", distance, heigth);

            Obstacles[] obstacles = new Obstacles[6];
            boolean isRunningTrack;
            for (int i = 0; i < obstacles.length; i++) {
                    distance = rand.nextInt(10);
                    isRunningTrack = rand.nextBoolean();
                    if (isRunningTrack) {

                            obstacles[i] = new running_track("беговая " + i + " ", distance);

                    } else {

                            obstacles[i] = new Wall("нависшая " + i + " ", heigth);

                    }
            }

            for (int i = 0; i < runners.length; i++) {
                    boolean result = true;
                    for (int j = 0; j < obstacles.length; j++) {


                            result = obstacles[j].moving(runners[i]);

                            if (!result) {
                                    break;
                            }
                    }

                    if (result) {
                            System.out.println();
                            System.out.println("Отлично");
                            System.out.println();
                    } else {
                            System.out.println();
                            System.out.println("Провал");
                            System.out.println();
                    }

            }
    }
}

//
//        Human h1 = new Human("Даниил", 10, 20);
//        Human h2 = new Human("Никита", 12, 18);
//        List<Human> hList = new ArrayList<>();
//
//            hList.add(h1);
//            hList.add(h2);
//            System.out.println("Люди: ");
//            System.out.println("Имя - " + h1.getName() + " - Скорость - " + h1.getSpeedrun() + " - Высота прыжка - " + h1.getHeightjump() );
//            System.out.println("Имя - " + h2.getName() + " - Скорость - " + h2.getSpeedrun() + " - Высота прыжка - " + h2.getHeightjump() );
//            System.out.println();
//
//        Cat c1 = new Cat("Мяукин", 15, 34);
//        Cat c2 = new Cat("Муркин", 22, 36);
//        List<Cat> cList = new ArrayList<>();
//
//            cList.add(c1);
//            cList.add(c2);
//            System.out.println("Кошки: ");
//
//            System.out.println("Имя - " + c1.getCname() + " - Скорость - " + c1.getCspeedrun() + " - Высота прыжка - " + c1.getCheightjump() );
//            System.out.println("Имя - " + c2.getCname() + " - Скорость - " + c2.getCspeedrun() + " - Высота прыжка - " + c2.getCheightjump() );
//            System.out.println();
//
//        Robot r1 = new Robot("Бип", 8, 25);
//        Robot r2 = new Robot("Буп", 5, 30);
//        List<Robot> rList = new ArrayList<>();
//            rList.add(r1);
//            rList.add(r2);
//
//            System.out.println("Роботы: ");
//            System.out.println("Имя - " + r1.getRname() + " - Скорость - " + r1.getRspeedrun() + " - Высота прыжка - " + r1.getRheightjump() );
//            System.out.println("Имя - " + r2.getRname() + " - Скорость - " + r2.getRspeedrun() + " - Высота прыжка - " + r2.getRheightjump() );
//            System.out.println();
