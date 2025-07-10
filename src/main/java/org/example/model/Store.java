package org.example.model;

public class Store {
    public static void main(String[] args) {
    ProductForSale[] products = {
            new Chocolate("Bitter Chocolate", 25, "Dark"),
            new Coke("Cocal Cola", 10, "Cold"),
            new Bread("Bread", 1, "Fresh")
    };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(int i = 0; i < products.length; i++){
            products[i].showDetails();
        }
    }
}