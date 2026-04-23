package com.supermarket.subscription;

public class PremiumSubscription implements SubscriptionStrategy {

    @Override
    public double calculateDiscount(double totalAmount) {
        return totalAmount * 0.10;
    }

    @Override
    public String getSubscriptionName() {
        return "Premium";
    }
}
