public class Purchase {

    private final int quantity;
    private final double price;
    private final double discount;
    public Purchase(int quantity, double price, double discount) {
        this.quantity = quantity;
        this.price = price;
        this.discount = discount / 100; 
    }
    public double[] calculateTotal() {
        double totalWithoutDiscount = quantity * price;
        double totalWithDiscount = totalWithoutDiscount * (1 - discount);

        return new double[]{roundToTwoDecimals(totalWithoutDiscount), roundToTwoDecimals(totalWithDiscount)};
    }
    private static double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}

