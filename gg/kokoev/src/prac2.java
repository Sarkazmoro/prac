public class prac2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7, 8, 9, 10};
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            System.out.print(num + " ");

            if (num % 2 == 0)
                    sum +=num;
            else
                count++;
        }
        System.out.println("Сумма четных: " +sum);
        System.out.println("Нечетных : " + count);

    }
}
