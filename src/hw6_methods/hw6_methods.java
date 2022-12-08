package hw6_methods;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class hw6_methods {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void checksLeapYear(int yearLeap) {

        if (yearLeap % 400 == 0) {
            System.out.println(yearLeap + " год является високосным");
        } else if (yearLeap % 100 != 0 && yearLeap % 4 == 0) {
            System.out.println(yearLeap + " год является високосным");
        } else {
            System.out.println(yearLeap + " год НЕ является високосным");
        }
    }


    public static void task1() {
        System.out.println("Задача 1");

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        checksLeapYear(year);

    }

    public static void choosingVersion(int currentYear, int OS) {

        if (currentYear < 2015) {
            if (OS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else if (OS == 0) {
            System.out.println("Установите приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите приложения для Android по ссылке.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Если у Вас ОС IOS - введите 0, если Android - введите 1.");
        int clientOS = scanner.nextInt();
        //int currentYear = LocalDate.now().getYear();
        System.out.println("Введите год выпуска Вашего телефона");
        int clientDeviceYear = scanner.nextInt();

        choosingVersion(clientDeviceYear, clientOS);
    }

    public static int calculatingDeliveryTime(int distance) {

        if (distance <= 20) {
            distance = 1;
        } else if (distance > 20 && distance <= 60) {
            distance = 2;
        } else if (distance > 60 && distance <= 100) {
            distance = 3;
        } else {
            distance = 1000;
        }
        return distance;
    }

    public static void task3() {
        System.out.println("Задача 3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какое растояние до Вас в километрах");
        int deliveryDistance = scanner.nextInt();

        deliveryDistance = calculatingDeliveryTime(deliveryDistance);

        System.out.println("Потребуется дней: " + deliveryDistance + " .");
    }
}
