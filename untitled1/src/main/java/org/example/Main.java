package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Czlowiek> ludzie = new ArrayList<Czlowiek>();
        ludzie.add(new Czlowiek('K', "Asia", "Wczorajsza"));
        ludzie.add(new Czlowiek('M', "Marcin", "Nikczemny"));
        ludzie.add(new Czlowiek('M', "Slawek", "Abacki"));
        ludzie.add(new Czlowiek('K', "Kasia", "Borowik"));
        ludzie.add(new Czlowiek('K', "Dorota", "Borowik"));
        ludzie.add(new Czlowiek('M', "Tomek", "Daszek"));
        ludzie.add(new Czlowiek('K', "Ania", "Daszek"));

        System.out.println("Nieposortowanie: ");
        for(Czlowiek czlowiek : ludzie) {
            System.out.println(czlowiek);
        }

        Comparator<Czlowiek> objectComparator = new Comparator<>() {
            @Override
            public int compare(Czlowiek o1, Czlowiek o2) {
                int porownaneNazwiska = String.CASE_INSENSITIVE_ORDER.compare(o1.getNazwisko(), o2.getNazwisko());
                if(porownaneNazwiska == 0) {
                    return String.CASE_INSENSITIVE_ORDER.compare(o1.getImie(), o2.getImie());
                }
                else {
                    return porownaneNazwiska;
                }
            }
        };
        Collections.sort(ludzie, objectComparator);

        System.out.println("\nPosortowane: ");
        for(Czlowiek czlowiek : ludzie) {
            System.out.println(czlowiek);
        }
    }

}