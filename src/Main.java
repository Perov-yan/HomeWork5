public class Main {
    public static void main(String[] args) {

        System.out.println("Здание 1:");
        byte clientOS = 1;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            }
        System.out.println(" ");

        System.out.println("Здание 2:");
        short clientDeviceYear = 2015;
        var OS = "Operating System";
        if (clientOS == 0){
            OS = "IOS";
        }   else {
            OS = "Android";
        }
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для " + OS + " по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для " + OS + " по ссылке");
        }
        System.out.println(" ");

        System.out.println("Здание 3:");
        int year = 2024;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
                } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println(" ");

        System.out.println("Здание 4:");
        short deliveryDistance = 95;
        byte deliveryTime = 1;
        if ( deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if ( deliveryDistance > 60 && deliveryDistance <= 100){
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println(" ");

        System.out.println("Здание 5:");
        Byte monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
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
                System.out.println("Такого месяца не существует");
        }
    }
}