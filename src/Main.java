public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("Задание 1.");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        //задание 2
        System.out.println("Задание 2.");
        clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");

        }
        //задание 3
        System.out.println("Задание 3.");
        int year = 1600;
        boolean isLeap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeap) {
            System.out.println("Этот год високосный!");
        } else {
            System.out.println("Этот год не високосный!");
        }

        //задание 4
        System.out.println("Задание 4.");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        System.out.println("Задание 5.");
        int monthOfYear = 1;
        switch (monthOfYear) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого сезона не существует");

        }


    }
}