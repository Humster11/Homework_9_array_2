public class Task2 {
    public static void main(String[] args) {
        int[] payments = {50_000, 100_000, 37_000, 500, 10_000};
        int minPayment = payments[0];
        int maxPayment = 0;

        for (int i = 0; i < payments.length; i++){
            if (payments[i]<minPayment){
                minPayment = payments[i];
            }
            if (payments[i]>maxPayment){
                maxPayment = payments[i];
            }
        }

        System.out.println(minPayment);
        System.out.println(maxPayment);
    }
}
