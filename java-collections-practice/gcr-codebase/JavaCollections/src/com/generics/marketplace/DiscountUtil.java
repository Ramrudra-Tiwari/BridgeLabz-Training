package com.generics.marketplace;

// utility class for discounts
public class DiscountUtil {

    // generic method to apply discount
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

        double originalPrice = product.getPrice();
        double discountAmount = (originalPrice * percentage) / 100;
        double finalPrice = originalPrice - discountAmount;

        product.setPrice(finalPrice);
    }
}
