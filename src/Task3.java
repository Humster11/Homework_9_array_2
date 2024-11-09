public class Task3 {
    public static void main(String[] args) {
        int[] payments = {50_000, 100_000, 37_000, 500, 10_000};
        float sum = 0;
        float averagePayment = 0;
        for (int element : payments) {
            sum = sum+element;
        }
        averagePayment = sum/4;
        System.out.println("Средняя сумма трат за месяц составила "+averagePayment+" рублей");
    }
}
