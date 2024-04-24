package org.example;

public class Product {
    private String nazwa;
    private float cena;
    private int ilosc;

    public Product(String nazwa, float cena, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public int getIlosc() {
        return ilosc;
    }

    public float getCena() {
        return cena;
    }

    public String getNazwa() {
        return nazwa;
    }
}
