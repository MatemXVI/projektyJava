package org.example;

import java.util.ArrayList;

public class Order {
    ArrayList<Product> produkty = new ArrayList<>();

    public void addToCart(Product product) {
        produkty.add(product);
    }

    public void getProdukty() {
        System.out.println("Lista produktów:");
        int i = 1;
        for (Product produkt :
                produkty) {
            System.out.println("Produkt nr " + i);
            System.out.println("Nazwa: " + produkt.getNazwa());
            System.out.println("Cena: " + produkt.getCena() + "zł");
            System.out.println("Ilość: " + produkt.getIlosc());
            i++;
        }
        System.out.println("Łączna wartość zamówienia: " + sum() + " zł");
    }

    public float sum() {
        float sum = 0;
        for (Product produkt :
                produkty) {
           sum += (produkt.getCena()* produkt.getIlosc());
        }
        return sum;
    }
}
