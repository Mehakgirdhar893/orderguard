
package com.orderguard.orderguard;

public class Ordertest {

    public static void main(String[] args) {

        Order order = new Order(1L, "Laptop", 55000.0);

        System.out.println(order.getId());
        System.out.println(order.getProductName());
        System.out.println(order.getAmount());


        order.setProductName("Keyboard");
        order.setAmount(2500.0);

        System.out.println("Updated product: " + order.getProductName());
        System.out.println("Updated amount: " + order.getAmount());

    }

}
