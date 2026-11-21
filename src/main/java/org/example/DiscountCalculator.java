
package org.example;

public class DiscountCalculator {

    public double calculateDiscount(double amount) {

        if (amount >= 1000) {
            return amount * 0.10;
        }

        return 0;
    }

    public double calculateFinalAmount(double amount) {

        return amount - calculateDiscount(amount);
    }

    public static void main(String[] args) {

        DiscountCalculator obj = new DiscountCalculator();

        double amount = 2000;

        System.out.println("Purchase Amount: " + amount);
        System.out.println("Discount: " +
                obj.calculateDiscount(amount));
        System.out.println("Final Amount: " +
                obj.calculateFinalAmount(amount));
    }
}
