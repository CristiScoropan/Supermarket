package com.supermarket.model;

import com.supermarket.subscription.SubscriptionStrategy;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<OrderItem> items;
    private SubscriptionStrategy subscriptionStrategy;

    private Order() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        double discount = subscriptionStrategy.calculateDiscount(total);
        return total - discount;
    }

    public void printOrder() {
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Subscription: " + subscriptionStrategy.getSubscriptionName());
        System.out.println("Total Price: " + getTotalAmount());
    }

    public static class Builder {
        private String customerName;
        private List<OrderItem> items;
        private SubscriptionStrategy subscriptionStrategy;

        public Builder() {
            this.items = new ArrayList<>();
        }

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder addItem(OrderItem item) {
            this.items.add(item);
            return this;
        }

        public Builder subscriptionStrategy(SubscriptionStrategy subscriptionStrategy) {
            this.subscriptionStrategy = subscriptionStrategy;
            return this;
        }

        public Order build() {
            Order order = new Order();
            order.customerName = customerName;
            order.items = items;
            order.subscriptionStrategy = subscriptionStrategy;
            return order;
        }
    }
}
