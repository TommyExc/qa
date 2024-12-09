
public class Main {
    public static void main(String[] args) {
        Purchase purchase1 = new Purchase(10, 150.50, 0.75);
        Purchase purchase2 = new Purchase(7, 200.00, 42.575);
        Purchase purchase3 = new Purchase(15, 120.25, 59.1);

        System.out.println("Первая покупка:");
        displayResults(purchase1);

        System.out.println("\nВторая покупка:");
        displayResults(purchase2);

        System.out.println("\nТретья покупка:");
        displayResults(purchase3);
    }
    private static void displayResults(Purchase purchase) {
        double[] totals = purchase.calculateTotal();
        System.out.printf("Общая стоимость без скидки: %.2f\n", totals[0]);
        System.out.printf("Общая стоимость со скидкой: %.2f\n", totals[1]);
    }
}


