import java.util.Arrays;

//import static com.sun.tools.doclint.Entity.sum;

public class hw4_arrays {
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task1_3();
        task1_4();
        task2_1();
        task2_2();
        task2_3();
        task2_4();
    }

    public static void task1_1() {
        System.out.println("Задача 1_1");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        boolean[] bools = new boolean[2];
    }

    public static void task1_2() {
        System.out.println("Задача 1_2");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};
        boolean[] arr3 = new boolean[2];

        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i <= arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
    }

    public static void task1_3() {
        System.out.println("Задача 1_3");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        boolean[] arr3 = new boolean[2];

        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
    }

    public static void task1_4() {
        System.out.println("Задача 1_4");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += +1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }


    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task2_1() {
        System.out.println("Задача 2_1");

        int[] arr = generateRandomArray();

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2_2() {
        System.out.println("Задача 2_2");

        int[] arr = generateRandomArray();

        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[arr.length - 1] + " рублей. Максимальная сумма трат за день составила " + arr[0] + " рублей».");
    }

    public static void task2_3() {
        System.out.println("Задача 2_3");

        int[] arr = generateRandomArray();

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        sum = sum / 30;
        double sumAverage = Math.round(sum * 100.0) / 10000.0;
        System.out.println("Средняя сумма трат за месяц составила " + sumAverage + " рублей.");
    }

    public static void task2_4() {
        System.out.println("Задача 2_4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length; i++) {

            if (reverseFullName[i] == ' ' && i != 0) {

                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(reverseFullName[j]);
                }
                System.out.print(" ");

                for (int g = reverseFullName.length - 1; g > i ; g--) {
                    System.out.print(reverseFullName[g]);
                }
            }
        }
    }
}