package org.example.model;

public class Coke extends ProductForSale{
    private String name;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(name);
    }
}
