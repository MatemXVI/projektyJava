package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Liczby {
    Scanner scanner = new Scanner(System.in);

    List<Integer> liczby = new ArrayList<>();

    public int wczytaj_ilosc_liczb() {
        System.out.println("Podaj ilość liczb: ");
        int ilosc_liczb = scanner.nextInt();
        return ilosc_liczb;
    }

    public void wczytaj_liczby(int ilosc){
        for (int i = 1; i <= ilosc; i++) {
            System.out.println("Podaj liczbe nr " + i);
            int liczba = scanner.nextInt();
            liczby.add(liczba);
        }
    }

    public int suma(){
        int suma = 0;
        for (int liczba : liczby){
            suma += liczba;
        }
        return suma;
    }

    public int srednia(int suma, int ilosc_liczb){

        int srednia = suma/ilosc_liczb;
        return srednia;
    }
}
