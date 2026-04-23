package com.supermarket.subscription;

public interface SubscriptionStrategy {
    double calculateDiscount(double totalAmount);
    String getSubscriptionName();
}
