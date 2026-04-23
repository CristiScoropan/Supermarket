package com.supermarket.subscription;

public class RegularSubscription implements SubscriptionStrategy {

    @Override
    public double calculateDiscount(double totalAmount) {
        return 0.0;
    }

    @Override
    public String getSubscriptionName() {
        return "Regular";
    }
}
