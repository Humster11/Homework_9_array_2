public class Task1 {
    public static void main(String[] args) {
        int[] payments = {50_000, 100_000, 37_000, 500, 10_000};
        int sum = 0;
        for (int element : payments) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");

    }
}