package org.example;

import java.util.Arrays;

public class Test {
    public static void main(String args[]){
        //Tworzymy kilku pracowników
        Pracownik krzysiek = new Pracownik("Krzysiek", "Piotrowicz", 2000);
        Pracownik piotrek = new Pracownik("Piotrek", "Wolny", 3000);
        Pracownik kasia = new Pracownik("Kasia", "Krotwicka", 2500);
        Pracownik wlodek = new Pracownik("Wlodek", "Zieba", 2300);

        //umieszczamy naszych pracowników w tablicy
        Pracownik[] prac = {krzysiek, piotrek, kasia, wlodek};
        //tworzymy obiekt komparatora, który wcześniej napisaliśmy
        Komparator komp = new Komparator();
        //sortujemy tablicę przy użyciu komparatora
        Arrays.sort(prac, komp);
        //wyświetlamy posortowaną tablicę
        wyswietl(prac);
    }

    //metoda wyświetlajca tablicę w ładnej formie
    public static void wyswietl(Pracownik[] prac){
        for(Pracownik p: prac)
            System.out.println(p);
    }
}
