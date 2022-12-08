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


    public static String checksLeapYear(int yearLeap, String leapYear) {

        leapYear = Integer.toString(yearLeap);
        if (yearLeap % 400 == 0) {
           return leapYear + " год является високосным.";
        } else if (yearLeap % 100 != 0 && yearLeap % 4 == 0) {
            return yearLeap + " год является високосным";
        } else {
            return yearLeap + " год НЕ является високосным";
        }
    }
    public static void task1() {
        System.out.println("Задача 1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите проверяемый год:");
        int year = scanner.nextInt();
        String yearStr = "";

        yearStr = checksLeapYear(year, yearStr);
        System.out.println(yearStr);
    }

    public static String choosingVersion(int currentYear, int OS, String answer) {

        if (currentYear < 2015) {
            if (OS == 0) {
                return "Установите облегченную версию приложения для iOS по ссылке.";
            } else {
               return "Установите облегченную версию приложения для Android по ссылке.";
            }
        } else if (OS == 0) {
            return "Установите приложения для iOS по ссылке.";
        } else {
            return "Установите приложения для Android по ссылке.";
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Если у Вас ОС IOS - введите 0, если Android - введите 1.");
        int clientOS = scanner.nextInt();

        System.out.println("Введите год выпуска Вашего телефона");
        int clientDeviceYear = scanner.nextInt();

        String answer = "";
        answer = choosingVersion(clientDeviceYear, clientOS, answer);

        System.out.println(answer);
    }

    public static String calculatingDeliveryTime(int distance, String answer) {


        if (distance <= 20) {
            return "Потребуется один день";
        } else if (distance > 20 && distance <= 60) {
            return "Потребуется два деня";
        } else if (distance > 60 && distance <= 100) {
            return "Потребуется три дня";
        } else {
            return "На такое растояние доставки нет";
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какое растояние до Вас в километрах");
        int deliveryDistance = scanner.nextInt();

        String answer = "";
        answer = calculatingDeliveryTime(deliveryDistance, answer);

        System.out.println(answer);
    }
}
