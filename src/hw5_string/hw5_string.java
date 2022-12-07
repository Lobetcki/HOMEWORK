package hw5_string;

import java.util.Scanner;

public class hw5_string {
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task1_3();
        task2_1();
        task2_2();
        task2_3();
        task2_4();
    }

    public static void task1_1 () {
        System.out.println("Задача 1_1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName +" "+ middleName +" "+ lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task1_2 () {
        System.out.println("Задача 1_2");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName +" "+ middleName +" "+ lastName;
        String toUpperCaseFullName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + toUpperCaseFullName);
    }

    public static void task1_3 () {
        System.out.println("Задача 1_3");

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё","е");

        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    public static void task2_1 () {
        System.out.println("Задача 2_1");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.next();

        System.out.println("Hello, " + name);
    }

    public static void task2_2 () {
        System.out.println("Задача 2_2");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Не подскажете, сколько сейчас градусов ниже нуля?");
        int t = scanner.nextInt();

        System.out.println("Температура воздуха сегодня: " + t + " градусов.");
    }

    public static void task2_3 () {
        System.out.println("Задача 2_3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текущий день месяца: ");
        int dd = scanner.nextInt();

        System.out.println("Введите текущий нромер месяца: ");
        int mm = scanner.nextInt();

        System.out.println("Введите текущий год: ");
        int yyyy = scanner.nextInt();

        System.out.println("сегодня: " + dd + ":" + mm + ":" + yyyy + " г.");
    }

    public static void task2_4 () {
        System.out.println("Задача 2_4");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите : имя помощника ");
        String nameAssistant = scanner.nextLine();

        System.out.println("Введите тколичество сообщений: ");
        int nomer = scanner.nextInt();

        System.out.println("Привет, " + name + "! Это твой помощник " + nameAssistant + ". У тебя " + nomer + " новых писем.");
    }
}
