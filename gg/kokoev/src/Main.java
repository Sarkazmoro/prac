import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = 2026;
        System.out.print("Введите год рожения: ");
        int birthday = scanner.nextInt();

        if (birthday > year) {
            System.out.println("год из будущего");
        } else {
            int age = year - birthday;

            if (age < 18) {
                System.out.println("Не совершеннолетний");
            } else if(age <= 65) {
                System.out.println("Вы взрослый");
            } else {
                System.out.println("Вы пенсионер");
            }
        }
    }
}