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
    }
}