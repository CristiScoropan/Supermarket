package com.supermarket.subscription;

public class VIPSubscription implements SubscriptionStrategy {

    @Override
    public double calculateDiscount(double totalAmount) {
        return totalAmount * 0.20;
    }

    @Override
    public String getSubscriptionName() {
        return "VIP";
    }
}
