package com.supermarket;

import com.supermarket.model.OrderItem;
import com.supermarket.model.Product;
import com.supermarket.model.Order;
import com.supermarket.subscription.PremiumSubscription;
import com.supermarket.subscription.RegularSubscription;
import com.supermarket.subscription.VIPSubscription;

public class MainBuilder {
    public static void main(String[] args) {
        Order.Builder builder = new Order.Builder();
        Order.Builder builder2 = new Order.Builder();
        Order.Builder builder3 = new Order.Builder();

        Product p1 = new Product("Mar", 1.00);
        Product p2 = new Product("Ciocolata", 2.50);
        Product p3 = new Product("Banane", 3.50);

        Order order = builder.customerName("Cristi")
                .addItem(new OrderItem(p1, 5))
                .addItem(new OrderItem(p2, 2))
                .subscriptionStrategy(new RegularSubscription())
                .build();

        Order order2 = builder2.customerName("Andrei")
                .addItem(new OrderItem(p1, 3))
                .addItem(new OrderItem(p2, 2))
                .subscriptionStrategy(new PremiumSubscription())
                .build();

        Order order3 = builder3.customerName("Marius")
                .addItem(new OrderItem(p1, 1))
                .addItem(new OrderItem(p2, 2))
                .addItem(new OrderItem(p3, 10))
                .subscriptionStrategy(new VIPSubscription())
                .build();

        order.printOrder();
        order2.printOrder();
        order3.printOrder();
    }
}
