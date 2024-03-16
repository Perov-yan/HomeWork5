public class Main {
    public static void main(String[] args) {

        System.out.println("Здание 1:");
        byte ClientOS = 3;
        switch (ClientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Установите версию приложения для ПК по ссылке");
            }
        System.out.println(" ");

    }
}