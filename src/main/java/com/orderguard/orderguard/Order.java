
package com.orderguard.orderguard;

public class Order {

    private Long id;
    private String productName;
    private double amount;

    public Order(Long id, String productName, double amount) {
        this.id = id;
        this.productName = productName;
        this.amount = amount;
    }


    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getAmount() {
        return amount;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
