import java.security.PublicKey;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    //Реализуйте метод, который получает в качестве параметра год,
    // проверяет, является ли он високосным, и выводит результат в консоль.

    public static boolean checkYear(int year) {
        boolean checkYear = false;
        if (year % 400 != 0 && (year % 4 != 0 || year % 100 == 0)) {
            checkYear = false;
            System.out.println("" + year + "-й год HE является високосным.");
        } else {
            checkYear = true;
            System.out.println("" + year + "-й год является високосным.");
        }
        return checkYear;
    }

    public static void task1() {
        System.out.println();
        System.out.println("Решение задачи №1 через метод:");
        int year = 2020;
        checkYear(year);
    }


    // Напишите метод, куда подаются два параметра: тип операционной системы
    // (0 — iOS, 1 — Android ) и год выпуска устройства.
    //Если устройство старше текущего года,
    // предложите ему установить облегченную версию.
    public static void checkDeviseYear(int clientDeviceYear, int systemType) {
        if (systemType == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android.");
            } else {
                System.out.println("Установите обычную версию для Android.");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для iOS.");
        } else {
            System.out.println("Установите обычную версию для iOS.");
        }

    }

    public static void task2() {
        System.out.println();
        System.out.println("Решение задачи №2 через метод:");
        int clientDeviceYear = 2018;
        int systemType = 0;
        checkDeviseYear(clientDeviceYear, systemType);
    }

    // Возвращаемся к задаче на расчет дней доставки банковской карты.
    // Ваша задача — доработать код, а именно написать метод,
    // который на вход принимает дистанцию и возвращает итоговое
    // количество дней доставки.

    public static void checkDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуется дней: 1.");
        } else if (deliveryDistance < 60) {
            System.out.println("Для доставки потребуется дней: 2.");
        } else if (deliveryDistance < 100) {
            System.out.println("Для доставки потребуется дней: 3.");
        } else {
            System.out.println("Доставки нет.");
        }
    }
    public static void task3() {
        System.out.println();
        System.out.println("Решение задачи №3 через метод:");
        int deliveryDistance = 9;
        checkDelivery(deliveryDistance);
    }

}



