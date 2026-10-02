import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int currentYear = 2026;
        int bdYear = 0;
        System.out.print("Введите ваш год рождения:  ");

        while (true) {
            bdYear = scan.nextInt();
            if (bdYear <= currentYear) {
                break;
            }
        }

        int age = currentYear - bdYear;
        System.out.print("Вы: ");
        if (age >= 0 && age < 18) {
            System.out.println("несовершенолетний");
        } else if (age >= 18 && age< 65) {
            System.out.println("взрослый");
        } else if (age <= 105) {
            System.out.println("пенсионер");
        } else {
            System.out.println("Ошибка");
        }

    }
}