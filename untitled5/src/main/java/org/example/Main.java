package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Liczby podprogram = new Liczby();
        int ilosc_liczb = podprogram.wczytaj_ilosc_liczb();
        List<Integer> liczby = new ArrayList<>();
        podprogram.wczytaj_liczby(ilosc_liczb);
        int suma = podprogram.suma();
        int srednia = podprogram.srednia(suma, ilosc_liczb);
        System.out.println("Suma wynosi: " + suma);
        System.out.println("Średnia wynosi: " + srednia);
    }
}